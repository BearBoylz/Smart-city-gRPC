package registry;

import io.grpc.stub.StreamObserver;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import registry.Registry;                   // 外层类
import registry.Registry.ControlMsg;
import registry.Registry.ControlAck;



/**
 * Service Registry 的完整实现：注册 / 发现 / 心跳 / 控制通道
 */
public class ServiceRegistryImpl
        extends ServiceRegistryGrpc.ServiceRegistryImplBase {

    /**
     * 存储已注册服务实例的并发 Map，key 用 serviceName
     */
    private final ConcurrentMap<String, ServiceEntry> registry = new ConcurrentHashMap<>();

    /**
     * 构造时启动清理任务：剔除超过 30s 未心跳的实例
     */
    public ServiceRegistryImpl() {
        ScheduledExecutorService cleaner = Executors.newSingleThreadScheduledExecutor();
        cleaner.scheduleAtFixedRate(() -> {
            long now = System.currentTimeMillis();
            registry.entrySet().removeIf(e ->
                    now - e.getValue().lastHeartbeatTs > Duration.ofSeconds(30).toMillis()
            );
        }, 10, 10, TimeUnit.SECONDS);
    }

    // 1) Unary: 注册服务
    @Override
    public void registerService(Registry.RegisterRequest req,
                                StreamObserver<Registry.RegisterResponse> resp) {
        String name = req.getInfo().getName();
        ServiceEntry entry = new ServiceEntry(req.getInfo());
        registry.put(name, entry);

        resp.onNext(Registry.RegisterResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Registered: " + name)
                .build());
        resp.onCompleted();
    }

    // 2) Server‑stream: 发现服务
    @Override
    public void discoverServices(Registry.DiscoverRequest req,
                                 StreamObserver<Registry.ServiceInfo> sink) {
        String tag = req.getTag();
        registry.forEach((name, entry) -> {
            if (entry.info.getTagsList().contains(tag)) {
                sink.onNext(entry.info);
            }
        });
        sink.onCompleted();
    }

    // 3) Client‑stream: 心跳
    @Override
    public StreamObserver<Registry.HeartbeatPing> heartbeat(
            StreamObserver<Registry.HeartbeatAck> sink) {

        return new StreamObserver<Registry.HeartbeatPing>() {
            @Override
            public void onNext(Registry.HeartbeatPing ping) {
                ServiceEntry entry = registry.get(ping.getName());
                if (entry != null) {
                    entry.lastHeartbeatTs = System.currentTimeMillis();
                    sink.onNext(Registry.HeartbeatAck.newBuilder()
                            .setReceived((int) ping.getTs())
                            .build());
                }
            }

            @Override
            public void onError(Throwable t) { /* 可选：日志 */ }

            @Override
            public void onCompleted() {
                sink.onCompleted();
            }
        };
    }

    // 4) Bi‑di: 控制通道
    @Override
    public StreamObserver<Registry.ControlMsg> controlChannel(
            StreamObserver<Registry.ControlAck> sink) {

        return new StreamObserver<Registry.ControlMsg>() {
            ServiceEntry meEntry;

            @Override
            public void onNext(Registry.ControlMsg cmd) {
                // 第一次消息时，绑定当前实例的 sink
                if (meEntry == null) {
                    meEntry = registry.get(cmd.getName());
                    if (meEntry != null) {
                        meEntry.controlSink = sink;
                    }
                }
                // 回 Ack 给客户端
                sink.onNext(Registry.ControlAck.newBuilder()
                        .setName(cmd.getName())
                        .setAck(true)
                        .build());
            }

            @Override
            public void onError(Throwable t) { /* 可选：日志 */ }

            @Override
            public void onCompleted() {
                sink.onCompleted();
            }
        };
    }

    /**
     * 内部类：保存 ServiceInfo、最近心跳时间、控制通道的 Sink
     */
    private static class ServiceEntry {
        final Registry.ServiceInfo info;
        volatile long lastHeartbeatTs;
        // 这里接收的是 ACK 流
        StreamObserver<ControlAck> controlSink;

        ServiceEntry(Registry.ServiceInfo info) {
            this.info = info;
            this.lastHeartbeatTs = System.currentTimeMillis();
        }
    }
}

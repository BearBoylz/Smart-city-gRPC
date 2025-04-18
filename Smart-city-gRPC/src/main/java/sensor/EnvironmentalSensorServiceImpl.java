// ===== sensor/EnvironmentalSensorServiceImpl.java =====
package sensor;

import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import registry.Registry; // 如果需要注册发现，可引入 RegistryClientHelper

public class EnvironmentalSensorServiceImpl extends EnvironmentalSensorServiceGrpc.EnvironmentalSensorServiceImplBase {

    // Unary: 获取一次读数
    @Override
    public void getReading(GetReadingRequest req, StreamObserver<SensorReading> resp) {
        // 模拟读数
        SensorReading reading = SensorReading.newBuilder()
                .setSensorId(req.getSensorId())
                .setTemperature(25.3)
                .setHumidity(60.0)
                .setPm25(12.4)
                .setTimestamp(System.currentTimeMillis())
                .build();
        resp.onNext(reading);
        resp.onCompleted();
    }

    // Server-stream: 持续推送读数
    @Override
    public void streamReadings(GetReadingRequest req, StreamObserver<SensorReading> sink) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(() -> {
            SensorReading r = SensorReading.newBuilder()
                    .setSensorId(req.getSensorId())
                    .setTemperature(20 + Math.random() * 10)
                    .setHumidity(50 + Math.random() * 20)
                    .setPm25(5 + Math.random() * 30)
                    .setTimestamp(System.currentTimeMillis())
                    .build();
            sink.onNext(r);
        }, 0, 1, TimeUnit.SECONDS);
        // 取消时停止
        sink.onCompleted();
    }

    // Client-stream: 上传校准数据
    @Override
    public StreamObserver<CalibrationData> uploadCalib(StreamObserver<CalibrationResult> sink) {
        List<CalibrationData> list = new ArrayList<>();
        return new StreamObserver<CalibrationData>() {
            @Override public void onNext(CalibrationData data) { list.add(data); }
            @Override public void onError(Throwable t) { /* error */ }
            @Override public void onCompleted() {
                // 模拟处理
                CalibrationResult res = CalibrationResult.newBuilder()
                        .setSensorId(list.get(0).getSensorId())
                        .setApplied(true)
                        .build();
                sink.onNext(res);
                sink.onCompleted();
            }
        };
    }

    // Bi-di: 实时调参
    @Override
    public StreamObserver<TuneCmd> liveTuning(StreamObserver<SensorReading> sink) {
        return new StreamObserver<TuneCmd>() {
            @Override public void onNext(TuneCmd cmd) {
                // 收到命令，返回一条新的读数
                SensorReading r = SensorReading.newBuilder()
                        .setSensorId(cmd.getSensorId())
                        .setTemperature(22.0 + cmd.getSampleRate())
                        .setHumidity(55.0)
                        .setPm25(10.0)
                        .setTimestamp(System.currentTimeMillis())
                        .build();
                sink.onNext(r);
            }
            @Override public void onError(Throwable t) { /* error */ }
            @Override public void onCompleted() { sink.onCompleted(); }
        };
    }
}


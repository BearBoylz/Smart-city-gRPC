package sensor;

import io.grpc.stub.StreamObserver;
import sensor.EnvironmentalSensorServiceGrpc;
import sensor.GetReadingRequest;
import sensor.SensorReading;
import sensor.CalibrationData;
import sensor.CalibrationResult;
import sensor.TuneCmd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 环境传感器服务实现，覆盖 4 种 gRPC 调用模式
 */
public class EnvironmentalSensorServiceImpl
        extends EnvironmentalSensorServiceGrpc.EnvironmentalSensorServiceImplBase {

    // Unary: 获取一次读数
    @Override
    public void getReading(GetReadingRequest req, StreamObserver<SensorReading> resp) {
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

    // Server‑stream: 持续推送读数（1 秒一次）
    @Override
    public void streamReadings(GetReadingRequest req,
                               StreamObserver<SensorReading> sink) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        // 1s 推送一次
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
        // 注意：这里暂不主动 onCompleted，客户端可自行 cancel()
    }

    // Client‑stream: 上传校准数据，收到 onCompleted 后回一个结果
    @Override
    public StreamObserver<CalibrationData> uploadCalib(
            StreamObserver<CalibrationResult> sink) {
        List<CalibrationData> list = new ArrayList<>();
        return new StreamObserver<CalibrationData>() {
            @Override public void onNext(CalibrationData data) {
                list.add(data);
            }
            @Override public void onError(Throwable t) {
                // 可选：记录日志
            }
            @Override public void onCompleted() {
                // 简单模拟：只用第一个的 sensor_id
                CalibrationResult res = CalibrationResult.newBuilder()
                        .setSensorId(list.get(0).getSensorId())
                        .setApplied(true)
                        .build();
                sink.onNext(res);
                sink.onCompleted();
            }
        };
    }

    // Bi‑di: 实时调参，收到 TuneCmd 就发一个新读数
    @Override
    public StreamObserver<TuneCmd> liveTuning(
            StreamObserver<SensorReading> sink) {
        return new StreamObserver<TuneCmd>() {
            @Override public void onNext(TuneCmd cmd) {
                SensorReading r = SensorReading.newBuilder()
                        .setSensorId(cmd.getSensorId())
                        // 用 sample_rate 简单影响温度
                        .setTemperature(22.0 + cmd.getSampleRate())
                        .setHumidity(55.0)
                        .setPm25(10.0)
                        .setTimestamp(System.currentTimeMillis())
                        .build();
                sink.onNext(r);
            }
            @Override public void onError(Throwable t) {
                // 可选：日志
            }
            @Override public void onCompleted() {
                sink.onCompleted();
            }
        };
    }
}

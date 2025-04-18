// ===== traffic/TrafficLightServiceImpl.java =====
package traffic;

import io.grpc.stub.StreamObserver;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficLightServiceImpl extends TrafficLightServiceGrpc.TrafficLightServiceImplBase {
    @Override
    public void getStatus(GetStatusRequest req, StreamObserver<TrafficLightStatus> resp) {
        TrafficLightStatus s = TrafficLightStatus.newBuilder()
                .setIntersectionId(req.getIntersectionId())
                .setColor(LightColor.RED)
                .setSecondsRemaining(30)
                .build();
        resp.onNext(s);
        resp.onCompleted();
    }
    @Override
    public void watchStatus(GetStatusRequest req, StreamObserver<TrafficLightStatus> sink) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(() -> {
            TrafficLightStatus s = TrafficLightStatus.newBuilder()
                    .setIntersectionId(req.getIntersectionId())
                    .setColor(LightColor.values()[(int)(Math.random()*3)])
                    .setSecondsRemaining(30)
                    .build();
            sink.onNext(s);
        }, 0, 1, TimeUnit.SECONDS);
        sink.onCompleted();
    }
    @Override
    public StreamObserver<SequenceUpdate> updateSeq(StreamObserver<SeqUpdateSummary> sink) {
        return new StreamObserver<SequenceUpdate>() {
            @Override public void onNext(SequenceUpdate upd) { /* apply sequence */ }
            @Override public void onError(Throwable t) { }
            @Override public void onCompleted() {
                sink.onNext(SeqUpdateSummary.newBuilder()
                        .setIntersectionId("*")
                        .setApplied(true)
                        .build());
                sink.onCompleted();
            }
        };
    }
    @Override
    public StreamObserver<TrafficLightCmd> liveControl(StreamObserver<TrafficLightStatus> sink) {
        return new StreamObserver<TrafficLightCmd>() {
            @Override public void onNext(TrafficLightCmd cmd) {
                TrafficLightStatus s = TrafficLightStatus.newBuilder()
                        .setIntersectionId(cmd.getIntersectionId())
                        .setColor(cmd.getOverride())
                        .setSecondsRemaining(30)
                        .build();
                sink.onNext(s);
            }
            @Override public void onError(Throwable t) { }
            @Override public void onCompleted() { sink.onCompleted(); }
        };
    }
}
// ===== transport/PublicTransportServiceImpl.java =====
package transport;

import io.grpc.stub.StreamObserver;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PublicTransportServiceImpl extends PublicTransportServiceGrpc.PublicTransportServiceImplBase {
    @Override
    public void getVehicle(VehicleRequest req, StreamObserver<VehiclePosition> resp) {
        VehiclePosition pos = VehiclePosition.newBuilder()
                .setVehicleId(req.getVehicleId())
                .setLat(40.0)
                .setLon(116.4)
                .setSpeed(50.0)
                .setTs(System.currentTimeMillis())
                .build();
        resp.onNext(pos);
        resp.onCompleted();
    }
    @Override
    public void streamFleet(VehicleRequest req, StreamObserver<VehiclePosition> sink) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(() -> {
            VehiclePosition pos = VehiclePosition.newBuilder()
                    .setVehicleId(req.getVehicleId())
                    .setLat(40 + Math.random())
                    .setLon(116 + Math.random())
                    .setSpeed(30 + Math.random() * 20)
                    .setTs(System.currentTimeMillis())
                    .build();
            sink.onNext(pos);
        }, 0, 1, TimeUnit.SECONDS);
        sink.onCompleted();
    }
    @Override
    public StreamObserver<RouteRecord> uploadRoute(StreamObserver<FleetSummary> sink) {
        return new StreamObserver<RouteRecord>() {
            int count;
            @Override public void onNext(RouteRecord rec) { count+= rec.getStopsCount(); }
            @Override public void onError(Throwable t) { }
            @Override public void onCompleted() {
                FleetSummary sum = FleetSummary.newBuilder()
                        .setVehicles(count)
                        .setAvgSpeed(42.0)
                        .build();
                sink.onNext(sum);
                sink.onCompleted();
            }
        };
    }
    @Override
    public StreamObserver<RouteRecord> fleetControl(StreamObserver<VehiclePosition> sink) {
        return new StreamObserver<RouteRecord>() {
            @Override public void onNext(RouteRecord rec) {
                VehiclePosition pos = VehiclePosition.newBuilder()
                        .setVehicleId(rec.getVehicleId())
                        .setLat(0).setLon(0).setSpeed(0).setTs(System.currentTimeMillis())
                        .build();
                sink.onNext(pos);
            }
            @Override public void onError(Throwable t) { }
            @Override public void onCompleted() { sink.onCompleted(); }
        };
    }
}
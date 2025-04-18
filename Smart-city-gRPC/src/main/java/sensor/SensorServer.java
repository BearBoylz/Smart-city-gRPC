// ===== sensor/SensorServer.java =====
package sensor;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SensorServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50051)
                .addService(new EnvironmentalSensorServiceImpl())
                .build()
                .start();
        System.out.println("Sensor Service started on 50051");
        server.awaitTermination();
    }
}
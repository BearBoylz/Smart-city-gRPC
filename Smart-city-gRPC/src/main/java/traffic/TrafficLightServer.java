// ===== traffic/TrafficLightServer.java =====
package traffic;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.util.concurrent.Executors;


public class TrafficLightServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50053)
                .addService(new TrafficLightServiceImpl())
                .build()
                .start();
        System.out.println("TrafficLight Service started on 50053");
        server.awaitTermination();
    }
}
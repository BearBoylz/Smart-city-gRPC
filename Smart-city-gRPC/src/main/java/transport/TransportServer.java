// ===== transport/TransportServer.java =====
package transport;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class TransportServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50052)
                .addService(new PublicTransportServiceImpl())
                .build()
                .start();
        System.out.println("PublicTransport Service started on 50052");
        server.awaitTermination();
    }
}
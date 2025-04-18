package registry;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class RegistryServer {
    public static void main(String[] args) throws Exception {
        Server srv = ServerBuilder.forPort(8500)
                .addService((BindableService) new ServiceRegistryImpl())
                .build()
                .start();
        System.out.println("Registry listening on 8500");
        srv.awaitTermination();
    }
}
package transport;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: public_transpot.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PublicTransportServiceGrpc {

  private PublicTransportServiceGrpc() {}

  public static final String SERVICE_NAME = "transport.PublicTransportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<transport.VehicleRequest,
      transport.VehiclePosition> getGetVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVehicle",
      requestType = transport.VehicleRequest.class,
      responseType = transport.VehiclePosition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<transport.VehicleRequest,
      transport.VehiclePosition> getGetVehicleMethod() {
    io.grpc.MethodDescriptor<transport.VehicleRequest, transport.VehiclePosition> getGetVehicleMethod;
    if ((getGetVehicleMethod = PublicTransportServiceGrpc.getGetVehicleMethod) == null) {
      synchronized (PublicTransportServiceGrpc.class) {
        if ((getGetVehicleMethod = PublicTransportServiceGrpc.getGetVehicleMethod) == null) {
          PublicTransportServiceGrpc.getGetVehicleMethod = getGetVehicleMethod =
              io.grpc.MethodDescriptor.<transport.VehicleRequest, transport.VehiclePosition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.VehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.VehiclePosition.getDefaultInstance()))
              .setSchemaDescriptor(new PublicTransportServiceMethodDescriptorSupplier("GetVehicle"))
              .build();
        }
      }
    }
    return getGetVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<transport.VehicleRequest,
      transport.VehiclePosition> getStreamFleetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamFleet",
      requestType = transport.VehicleRequest.class,
      responseType = transport.VehiclePosition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<transport.VehicleRequest,
      transport.VehiclePosition> getStreamFleetMethod() {
    io.grpc.MethodDescriptor<transport.VehicleRequest, transport.VehiclePosition> getStreamFleetMethod;
    if ((getStreamFleetMethod = PublicTransportServiceGrpc.getStreamFleetMethod) == null) {
      synchronized (PublicTransportServiceGrpc.class) {
        if ((getStreamFleetMethod = PublicTransportServiceGrpc.getStreamFleetMethod) == null) {
          PublicTransportServiceGrpc.getStreamFleetMethod = getStreamFleetMethod =
              io.grpc.MethodDescriptor.<transport.VehicleRequest, transport.VehiclePosition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamFleet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.VehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.VehiclePosition.getDefaultInstance()))
              .setSchemaDescriptor(new PublicTransportServiceMethodDescriptorSupplier("StreamFleet"))
              .build();
        }
      }
    }
    return getStreamFleetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<transport.RouteRecord,
      transport.FleetSummary> getUploadRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadRoute",
      requestType = transport.RouteRecord.class,
      responseType = transport.FleetSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<transport.RouteRecord,
      transport.FleetSummary> getUploadRouteMethod() {
    io.grpc.MethodDescriptor<transport.RouteRecord, transport.FleetSummary> getUploadRouteMethod;
    if ((getUploadRouteMethod = PublicTransportServiceGrpc.getUploadRouteMethod) == null) {
      synchronized (PublicTransportServiceGrpc.class) {
        if ((getUploadRouteMethod = PublicTransportServiceGrpc.getUploadRouteMethod) == null) {
          PublicTransportServiceGrpc.getUploadRouteMethod = getUploadRouteMethod =
              io.grpc.MethodDescriptor.<transport.RouteRecord, transport.FleetSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.RouteRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.FleetSummary.getDefaultInstance()))
              .setSchemaDescriptor(new PublicTransportServiceMethodDescriptorSupplier("UploadRoute"))
              .build();
        }
      }
    }
    return getUploadRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<transport.RouteRecord,
      transport.VehiclePosition> getFleetControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FleetControl",
      requestType = transport.RouteRecord.class,
      responseType = transport.VehiclePosition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<transport.RouteRecord,
      transport.VehiclePosition> getFleetControlMethod() {
    io.grpc.MethodDescriptor<transport.RouteRecord, transport.VehiclePosition> getFleetControlMethod;
    if ((getFleetControlMethod = PublicTransportServiceGrpc.getFleetControlMethod) == null) {
      synchronized (PublicTransportServiceGrpc.class) {
        if ((getFleetControlMethod = PublicTransportServiceGrpc.getFleetControlMethod) == null) {
          PublicTransportServiceGrpc.getFleetControlMethod = getFleetControlMethod =
              io.grpc.MethodDescriptor.<transport.RouteRecord, transport.VehiclePosition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FleetControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.RouteRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  transport.VehiclePosition.getDefaultInstance()))
              .setSchemaDescriptor(new PublicTransportServiceMethodDescriptorSupplier("FleetControl"))
              .build();
        }
      }
    }
    return getFleetControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublicTransportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicTransportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicTransportServiceStub>() {
        @java.lang.Override
        public PublicTransportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicTransportServiceStub(channel, callOptions);
        }
      };
    return PublicTransportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublicTransportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicTransportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicTransportServiceBlockingStub>() {
        @java.lang.Override
        public PublicTransportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicTransportServiceBlockingStub(channel, callOptions);
        }
      };
    return PublicTransportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PublicTransportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicTransportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicTransportServiceFutureStub>() {
        @java.lang.Override
        public PublicTransportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicTransportServiceFutureStub(channel, callOptions);
        }
      };
    return PublicTransportServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PublicTransportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void getVehicle(transport.VehicleRequest request,
        io.grpc.stub.StreamObserver<transport.VehiclePosition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVehicleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public void streamFleet(transport.VehicleRequest request,
        io.grpc.stub.StreamObserver<transport.VehiclePosition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamFleetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client‑stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<transport.RouteRecord> uploadRoute(
        io.grpc.stub.StreamObserver<transport.FleetSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bi‑di
     * </pre>
     */
    public io.grpc.stub.StreamObserver<transport.RouteRecord> fleetControl(
        io.grpc.stub.StreamObserver<transport.VehiclePosition> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFleetControlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehicleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                transport.VehicleRequest,
                transport.VehiclePosition>(
                  this, METHODID_GET_VEHICLE)))
          .addMethod(
            getStreamFleetMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                transport.VehicleRequest,
                transport.VehiclePosition>(
                  this, METHODID_STREAM_FLEET)))
          .addMethod(
            getUploadRouteMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                transport.RouteRecord,
                transport.FleetSummary>(
                  this, METHODID_UPLOAD_ROUTE)))
          .addMethod(
            getFleetControlMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                transport.RouteRecord,
                transport.VehiclePosition>(
                  this, METHODID_FLEET_CONTROL)))
          .build();
    }
  }

  /**
   */
  public static final class PublicTransportServiceStub extends io.grpc.stub.AbstractAsyncStub<PublicTransportServiceStub> {
    private PublicTransportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicTransportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicTransportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void getVehicle(transport.VehicleRequest request,
        io.grpc.stub.StreamObserver<transport.VehiclePosition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public void streamFleet(transport.VehicleRequest request,
        io.grpc.stub.StreamObserver<transport.VehiclePosition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamFleetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client‑stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<transport.RouteRecord> uploadRoute(
        io.grpc.stub.StreamObserver<transport.FleetSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bi‑di
     * </pre>
     */
    public io.grpc.stub.StreamObserver<transport.RouteRecord> fleetControl(
        io.grpc.stub.StreamObserver<transport.VehiclePosition> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFleetControlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PublicTransportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PublicTransportServiceBlockingStub> {
    private PublicTransportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicTransportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicTransportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public transport.VehiclePosition getVehicle(transport.VehicleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVehicleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public java.util.Iterator<transport.VehiclePosition> streamFleet(
        transport.VehicleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamFleetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PublicTransportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PublicTransportServiceFutureStub> {
    private PublicTransportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicTransportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicTransportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<transport.VehiclePosition> getVehicle(
        transport.VehicleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICLE = 0;
  private static final int METHODID_STREAM_FLEET = 1;
  private static final int METHODID_UPLOAD_ROUTE = 2;
  private static final int METHODID_FLEET_CONTROL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PublicTransportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublicTransportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICLE:
          serviceImpl.getVehicle((transport.VehicleRequest) request,
              (io.grpc.stub.StreamObserver<transport.VehiclePosition>) responseObserver);
          break;
        case METHODID_STREAM_FLEET:
          serviceImpl.streamFleet((transport.VehicleRequest) request,
              (io.grpc.stub.StreamObserver<transport.VehiclePosition>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadRoute(
              (io.grpc.stub.StreamObserver<transport.FleetSummary>) responseObserver);
        case METHODID_FLEET_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fleetControl(
              (io.grpc.stub.StreamObserver<transport.VehiclePosition>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PublicTransportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublicTransportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return transport.PublicTranspot.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PublicTransportService");
    }
  }

  private static final class PublicTransportServiceFileDescriptorSupplier
      extends PublicTransportServiceBaseDescriptorSupplier {
    PublicTransportServiceFileDescriptorSupplier() {}
  }

  private static final class PublicTransportServiceMethodDescriptorSupplier
      extends PublicTransportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublicTransportServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PublicTransportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublicTransportServiceFileDescriptorSupplier())
              .addMethod(getGetVehicleMethod())
              .addMethod(getStreamFleetMethod())
              .addMethod(getUploadRouteMethod())
              .addMethod(getFleetControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package registry;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: registry.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceRegistryGrpc {

  private ServiceRegistryGrpc() {}

  public static final String SERVICE_NAME = "registry.ServiceRegistry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<registry.RegisterRequest,
      registry.RegisterResponse> getRegisterServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterService",
      requestType = registry.RegisterRequest.class,
      responseType = registry.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<registry.RegisterRequest,
      registry.RegisterResponse> getRegisterServiceMethod() {
    io.grpc.MethodDescriptor<registry.RegisterRequest, registry.RegisterResponse> getRegisterServiceMethod;
    if ((getRegisterServiceMethod = ServiceRegistryGrpc.getRegisterServiceMethod) == null) {
      synchronized (ServiceRegistryGrpc.class) {
        if ((getRegisterServiceMethod = ServiceRegistryGrpc.getRegisterServiceMethod) == null) {
          ServiceRegistryGrpc.getRegisterServiceMethod = getRegisterServiceMethod =
              io.grpc.MethodDescriptor.<registry.RegisterRequest, registry.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceRegistryMethodDescriptorSupplier("RegisterService"))
              .build();
        }
      }
    }
    return getRegisterServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<registry.DiscoverRequest,
      registry.ServiceInfo> getDiscoverServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DiscoverServices",
      requestType = registry.DiscoverRequest.class,
      responseType = registry.ServiceInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<registry.DiscoverRequest,
      registry.ServiceInfo> getDiscoverServicesMethod() {
    io.grpc.MethodDescriptor<registry.DiscoverRequest, registry.ServiceInfo> getDiscoverServicesMethod;
    if ((getDiscoverServicesMethod = ServiceRegistryGrpc.getDiscoverServicesMethod) == null) {
      synchronized (ServiceRegistryGrpc.class) {
        if ((getDiscoverServicesMethod = ServiceRegistryGrpc.getDiscoverServicesMethod) == null) {
          ServiceRegistryGrpc.getDiscoverServicesMethod = getDiscoverServicesMethod =
              io.grpc.MethodDescriptor.<registry.DiscoverRequest, registry.ServiceInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DiscoverServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.DiscoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.ServiceInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceRegistryMethodDescriptorSupplier("DiscoverServices"))
              .build();
        }
      }
    }
    return getDiscoverServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<registry.HeartbeatPing,
      registry.HeartbeatAck> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = registry.HeartbeatPing.class,
      responseType = registry.HeartbeatAck.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<registry.HeartbeatPing,
      registry.HeartbeatAck> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<registry.HeartbeatPing, registry.HeartbeatAck> getHeartbeatMethod;
    if ((getHeartbeatMethod = ServiceRegistryGrpc.getHeartbeatMethod) == null) {
      synchronized (ServiceRegistryGrpc.class) {
        if ((getHeartbeatMethod = ServiceRegistryGrpc.getHeartbeatMethod) == null) {
          ServiceRegistryGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<registry.HeartbeatPing, registry.HeartbeatAck>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.HeartbeatPing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.HeartbeatAck.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceRegistryMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<registry.ControlMsg,
      registry.ControlAck> getControlChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlChannel",
      requestType = registry.ControlMsg.class,
      responseType = registry.ControlAck.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<registry.ControlMsg,
      registry.ControlAck> getControlChannelMethod() {
    io.grpc.MethodDescriptor<registry.ControlMsg, registry.ControlAck> getControlChannelMethod;
    if ((getControlChannelMethod = ServiceRegistryGrpc.getControlChannelMethod) == null) {
      synchronized (ServiceRegistryGrpc.class) {
        if ((getControlChannelMethod = ServiceRegistryGrpc.getControlChannelMethod) == null) {
          ServiceRegistryGrpc.getControlChannelMethod = getControlChannelMethod =
              io.grpc.MethodDescriptor.<registry.ControlMsg, registry.ControlAck>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.ControlMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  registry.ControlAck.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceRegistryMethodDescriptorSupplier("ControlChannel"))
              .build();
        }
      }
    }
    return getControlChannelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceRegistryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceRegistryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceRegistryStub>() {
        @java.lang.Override
        public ServiceRegistryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceRegistryStub(channel, callOptions);
        }
      };
    return ServiceRegistryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceRegistryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceRegistryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceRegistryBlockingStub>() {
        @java.lang.Override
        public ServiceRegistryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceRegistryBlockingStub(channel, callOptions);
        }
      };
    return ServiceRegistryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceRegistryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceRegistryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceRegistryFutureStub>() {
        @java.lang.Override
        public ServiceRegistryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceRegistryFutureStub(channel, callOptions);
        }
      };
    return ServiceRegistryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServiceRegistryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void registerService(registry.RegisterRequest request,
        io.grpc.stub.StreamObserver<registry.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public void discoverServices(registry.DiscoverRequest request,
        io.grpc.stub.StreamObserver<registry.ServiceInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscoverServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client‑stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<registry.HeartbeatPing> heartbeat(
        io.grpc.stub.StreamObserver<registry.HeartbeatAck> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bi‑di
     * </pre>
     */
    public io.grpc.stub.StreamObserver<registry.ControlMsg> controlChannel(
        io.grpc.stub.StreamObserver<registry.ControlAck> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getControlChannelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                registry.RegisterRequest,
                registry.RegisterResponse>(
                  this, METHODID_REGISTER_SERVICE)))
          .addMethod(
            getDiscoverServicesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                registry.DiscoverRequest,
                registry.ServiceInfo>(
                  this, METHODID_DISCOVER_SERVICES)))
          .addMethod(
            getHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                registry.HeartbeatPing,
                registry.HeartbeatAck>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getControlChannelMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                registry.ControlMsg,
                registry.ControlAck>(
                  this, METHODID_CONTROL_CHANNEL)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceRegistryStub extends io.grpc.stub.AbstractAsyncStub<ServiceRegistryStub> {
    private ServiceRegistryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceRegistryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceRegistryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void registerService(registry.RegisterRequest request,
        io.grpc.stub.StreamObserver<registry.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public void discoverServices(registry.DiscoverRequest request,
        io.grpc.stub.StreamObserver<registry.ServiceInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDiscoverServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client‑stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<registry.HeartbeatPing> heartbeat(
        io.grpc.stub.StreamObserver<registry.HeartbeatAck> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bi‑di
     * </pre>
     */
    public io.grpc.stub.StreamObserver<registry.ControlMsg> controlChannel(
        io.grpc.stub.StreamObserver<registry.ControlAck> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getControlChannelMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ServiceRegistryBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceRegistryBlockingStub> {
    private ServiceRegistryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceRegistryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceRegistryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public registry.RegisterResponse registerService(registry.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public java.util.Iterator<registry.ServiceInfo> discoverServices(
        registry.DiscoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDiscoverServicesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceRegistryFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceRegistryFutureStub> {
    private ServiceRegistryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceRegistryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceRegistryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<registry.RegisterResponse> registerService(
        registry.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SERVICE = 0;
  private static final int METHODID_DISCOVER_SERVICES = 1;
  private static final int METHODID_HEARTBEAT = 2;
  private static final int METHODID_CONTROL_CHANNEL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceRegistryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceRegistryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_SERVICE:
          serviceImpl.registerService((registry.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<registry.RegisterResponse>) responseObserver);
          break;
        case METHODID_DISCOVER_SERVICES:
          serviceImpl.discoverServices((registry.DiscoverRequest) request,
              (io.grpc.stub.StreamObserver<registry.ServiceInfo>) responseObserver);
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
        case METHODID_HEARTBEAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heartbeat(
              (io.grpc.stub.StreamObserver<registry.HeartbeatAck>) responseObserver);
        case METHODID_CONTROL_CHANNEL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlChannel(
              (io.grpc.stub.StreamObserver<registry.ControlAck>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceRegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceRegistryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return registry.Registry.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceRegistry");
    }
  }

  private static final class ServiceRegistryFileDescriptorSupplier
      extends ServiceRegistryBaseDescriptorSupplier {
    ServiceRegistryFileDescriptorSupplier() {}
  }

  private static final class ServiceRegistryMethodDescriptorSupplier
      extends ServiceRegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceRegistryMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceRegistryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceRegistryFileDescriptorSupplier())
              .addMethod(getRegisterServiceMethod())
              .addMethod(getDiscoverServicesMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getControlChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}

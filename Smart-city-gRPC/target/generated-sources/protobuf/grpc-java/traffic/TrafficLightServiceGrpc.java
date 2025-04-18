package traffic;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: traffic_light.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrafficLightServiceGrpc {

  private TrafficLightServiceGrpc() {}

  public static final String SERVICE_NAME = "traffic.TrafficLightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<traffic.TrafficLight.GetStatusRequest,
      traffic.TrafficLight.TrafficLightStatus> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = traffic.TrafficLight.GetStatusRequest.class,
      responseType = traffic.TrafficLight.TrafficLightStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<traffic.TrafficLight.GetStatusRequest,
      traffic.TrafficLight.TrafficLightStatus> getGetStatusMethod() {
    io.grpc.MethodDescriptor<traffic.TrafficLight.GetStatusRequest, traffic.TrafficLight.TrafficLightStatus> getGetStatusMethod;
    if ((getGetStatusMethod = TrafficLightServiceGrpc.getGetStatusMethod) == null) {
      synchronized (TrafficLightServiceGrpc.class) {
        if ((getGetStatusMethod = TrafficLightServiceGrpc.getGetStatusMethod) == null) {
          TrafficLightServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<traffic.TrafficLight.GetStatusRequest, traffic.TrafficLight.TrafficLightStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.TrafficLightStatus.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficLightServiceMethodDescriptorSupplier("GetStatus"))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<traffic.TrafficLight.GetStatusRequest,
      traffic.TrafficLight.TrafficLightStatus> getWatchStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchStatus",
      requestType = traffic.TrafficLight.GetStatusRequest.class,
      responseType = traffic.TrafficLight.TrafficLightStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<traffic.TrafficLight.GetStatusRequest,
      traffic.TrafficLight.TrafficLightStatus> getWatchStatusMethod() {
    io.grpc.MethodDescriptor<traffic.TrafficLight.GetStatusRequest, traffic.TrafficLight.TrafficLightStatus> getWatchStatusMethod;
    if ((getWatchStatusMethod = TrafficLightServiceGrpc.getWatchStatusMethod) == null) {
      synchronized (TrafficLightServiceGrpc.class) {
        if ((getWatchStatusMethod = TrafficLightServiceGrpc.getWatchStatusMethod) == null) {
          TrafficLightServiceGrpc.getWatchStatusMethod = getWatchStatusMethod =
              io.grpc.MethodDescriptor.<traffic.TrafficLight.GetStatusRequest, traffic.TrafficLight.TrafficLightStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.TrafficLightStatus.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficLightServiceMethodDescriptorSupplier("WatchStatus"))
              .build();
        }
      }
    }
    return getWatchStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<traffic.TrafficLight.SequenceUpdate,
      traffic.TrafficLight.SeqUpdateSummary> getUpdateSeqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSeq",
      requestType = traffic.TrafficLight.SequenceUpdate.class,
      responseType = traffic.TrafficLight.SeqUpdateSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<traffic.TrafficLight.SequenceUpdate,
      traffic.TrafficLight.SeqUpdateSummary> getUpdateSeqMethod() {
    io.grpc.MethodDescriptor<traffic.TrafficLight.SequenceUpdate, traffic.TrafficLight.SeqUpdateSummary> getUpdateSeqMethod;
    if ((getUpdateSeqMethod = TrafficLightServiceGrpc.getUpdateSeqMethod) == null) {
      synchronized (TrafficLightServiceGrpc.class) {
        if ((getUpdateSeqMethod = TrafficLightServiceGrpc.getUpdateSeqMethod) == null) {
          TrafficLightServiceGrpc.getUpdateSeqMethod = getUpdateSeqMethod =
              io.grpc.MethodDescriptor.<traffic.TrafficLight.SequenceUpdate, traffic.TrafficLight.SeqUpdateSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSeq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.SequenceUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.SeqUpdateSummary.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficLightServiceMethodDescriptorSupplier("UpdateSeq"))
              .build();
        }
      }
    }
    return getUpdateSeqMethod;
  }

  private static volatile io.grpc.MethodDescriptor<traffic.TrafficLight.TrafficLightCmd,
      traffic.TrafficLight.TrafficLightStatus> getLiveControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveControl",
      requestType = traffic.TrafficLight.TrafficLightCmd.class,
      responseType = traffic.TrafficLight.TrafficLightStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<traffic.TrafficLight.TrafficLightCmd,
      traffic.TrafficLight.TrafficLightStatus> getLiveControlMethod() {
    io.grpc.MethodDescriptor<traffic.TrafficLight.TrafficLightCmd, traffic.TrafficLight.TrafficLightStatus> getLiveControlMethod;
    if ((getLiveControlMethod = TrafficLightServiceGrpc.getLiveControlMethod) == null) {
      synchronized (TrafficLightServiceGrpc.class) {
        if ((getLiveControlMethod = TrafficLightServiceGrpc.getLiveControlMethod) == null) {
          TrafficLightServiceGrpc.getLiveControlMethod = getLiveControlMethod =
              io.grpc.MethodDescriptor.<traffic.TrafficLight.TrafficLightCmd, traffic.TrafficLight.TrafficLightStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.TrafficLightCmd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traffic.TrafficLight.TrafficLightStatus.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficLightServiceMethodDescriptorSupplier("LiveControl"))
              .build();
        }
      }
    }
    return getLiveControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrafficLightServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficLightServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficLightServiceStub>() {
        @java.lang.Override
        public TrafficLightServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficLightServiceStub(channel, callOptions);
        }
      };
    return TrafficLightServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrafficLightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficLightServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficLightServiceBlockingStub>() {
        @java.lang.Override
        public TrafficLightServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficLightServiceBlockingStub(channel, callOptions);
        }
      };
    return TrafficLightServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrafficLightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficLightServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficLightServiceFutureStub>() {
        @java.lang.Override
        public TrafficLightServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficLightServiceFutureStub(channel, callOptions);
        }
      };
    return TrafficLightServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrafficLightServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void getStatus(traffic.TrafficLight.GetStatusRequest request,
        io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public void watchStatus(traffic.TrafficLight.GetStatusRequest request,
        io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client‑stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<traffic.TrafficLight.SequenceUpdate> updateSeq(
        io.grpc.stub.StreamObserver<traffic.TrafficLight.SeqUpdateSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateSeqMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bi‑di
     * </pre>
     */
    public io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightCmd> liveControl(
        io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLiveControlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                traffic.TrafficLight.GetStatusRequest,
                traffic.TrafficLight.TrafficLightStatus>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getWatchStatusMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                traffic.TrafficLight.GetStatusRequest,
                traffic.TrafficLight.TrafficLightStatus>(
                  this, METHODID_WATCH_STATUS)))
          .addMethod(
            getUpdateSeqMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                traffic.TrafficLight.SequenceUpdate,
                traffic.TrafficLight.SeqUpdateSummary>(
                  this, METHODID_UPDATE_SEQ)))
          .addMethod(
            getLiveControlMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                traffic.TrafficLight.TrafficLightCmd,
                traffic.TrafficLight.TrafficLightStatus>(
                  this, METHODID_LIVE_CONTROL)))
          .build();
    }
  }

  /**
   */
  public static final class TrafficLightServiceStub extends io.grpc.stub.AbstractAsyncStub<TrafficLightServiceStub> {
    private TrafficLightServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficLightServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficLightServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void getStatus(traffic.TrafficLight.GetStatusRequest request,
        io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public void watchStatus(traffic.TrafficLight.GetStatusRequest request,
        io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client‑stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<traffic.TrafficLight.SequenceUpdate> updateSeq(
        io.grpc.stub.StreamObserver<traffic.TrafficLight.SeqUpdateSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUpdateSeqMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bi‑di
     * </pre>
     */
    public io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightCmd> liveControl(
        io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLiveControlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TrafficLightServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrafficLightServiceBlockingStub> {
    private TrafficLightServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficLightServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficLightServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public traffic.TrafficLight.TrafficLightStatus getStatus(traffic.TrafficLight.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server‑stream
     * </pre>
     */
    public java.util.Iterator<traffic.TrafficLight.TrafficLightStatus> watchStatus(
        traffic.TrafficLight.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrafficLightServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrafficLightServiceFutureStub> {
    private TrafficLightServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficLightServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficLightServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<traffic.TrafficLight.TrafficLightStatus> getStatus(
        traffic.TrafficLight.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_WATCH_STATUS = 1;
  private static final int METHODID_UPDATE_SEQ = 2;
  private static final int METHODID_LIVE_CONTROL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrafficLightServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrafficLightServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((traffic.TrafficLight.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus>) responseObserver);
          break;
        case METHODID_WATCH_STATUS:
          serviceImpl.watchStatus((traffic.TrafficLight.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus>) responseObserver);
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
        case METHODID_UPDATE_SEQ:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateSeq(
              (io.grpc.stub.StreamObserver<traffic.TrafficLight.SeqUpdateSummary>) responseObserver);
        case METHODID_LIVE_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveControl(
              (io.grpc.stub.StreamObserver<traffic.TrafficLight.TrafficLightStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrafficLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrafficLightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return traffic.TrafficLight.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrafficLightService");
    }
  }

  private static final class TrafficLightServiceFileDescriptorSupplier
      extends TrafficLightServiceBaseDescriptorSupplier {
    TrafficLightServiceFileDescriptorSupplier() {}
  }

  private static final class TrafficLightServiceMethodDescriptorSupplier
      extends TrafficLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrafficLightServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrafficLightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrafficLightServiceFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .addMethod(getWatchStatusMethod())
              .addMethod(getUpdateSeqMethod())
              .addMethod(getLiveControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}

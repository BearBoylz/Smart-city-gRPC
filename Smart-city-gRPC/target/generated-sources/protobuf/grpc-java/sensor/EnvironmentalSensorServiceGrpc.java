package sensor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: environment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnvironmentalSensorServiceGrpc {

  private EnvironmentalSensorServiceGrpc() {}

  public static final String SERVICE_NAME = "sensor.EnvironmentalSensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sensor.Environment.GetReadingRequest,
      sensor.Environment.SensorReading> getGetReadingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReading",
      requestType = sensor.Environment.GetReadingRequest.class,
      responseType = sensor.Environment.SensorReading.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sensor.Environment.GetReadingRequest,
      sensor.Environment.SensorReading> getGetReadingMethod() {
    io.grpc.MethodDescriptor<sensor.Environment.GetReadingRequest, sensor.Environment.SensorReading> getGetReadingMethod;
    if ((getGetReadingMethod = EnvironmentalSensorServiceGrpc.getGetReadingMethod) == null) {
      synchronized (EnvironmentalSensorServiceGrpc.class) {
        if ((getGetReadingMethod = EnvironmentalSensorServiceGrpc.getGetReadingMethod) == null) {
          EnvironmentalSensorServiceGrpc.getGetReadingMethod = getGetReadingMethod =
              io.grpc.MethodDescriptor.<sensor.Environment.GetReadingRequest, sensor.Environment.SensorReading>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.GetReadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.SensorReading.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentalSensorServiceMethodDescriptorSupplier("GetReading"))
              .build();
        }
      }
    }
    return getGetReadingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sensor.Environment.GetReadingRequest,
      sensor.Environment.SensorReading> getStreamReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamReadings",
      requestType = sensor.Environment.GetReadingRequest.class,
      responseType = sensor.Environment.SensorReading.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sensor.Environment.GetReadingRequest,
      sensor.Environment.SensorReading> getStreamReadingsMethod() {
    io.grpc.MethodDescriptor<sensor.Environment.GetReadingRequest, sensor.Environment.SensorReading> getStreamReadingsMethod;
    if ((getStreamReadingsMethod = EnvironmentalSensorServiceGrpc.getStreamReadingsMethod) == null) {
      synchronized (EnvironmentalSensorServiceGrpc.class) {
        if ((getStreamReadingsMethod = EnvironmentalSensorServiceGrpc.getStreamReadingsMethod) == null) {
          EnvironmentalSensorServiceGrpc.getStreamReadingsMethod = getStreamReadingsMethod =
              io.grpc.MethodDescriptor.<sensor.Environment.GetReadingRequest, sensor.Environment.SensorReading>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.GetReadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.SensorReading.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentalSensorServiceMethodDescriptorSupplier("StreamReadings"))
              .build();
        }
      }
    }
    return getStreamReadingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sensor.Environment.CalibrationData,
      sensor.Environment.CalibrationResult> getUploadCalibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadCalib",
      requestType = sensor.Environment.CalibrationData.class,
      responseType = sensor.Environment.CalibrationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<sensor.Environment.CalibrationData,
      sensor.Environment.CalibrationResult> getUploadCalibMethod() {
    io.grpc.MethodDescriptor<sensor.Environment.CalibrationData, sensor.Environment.CalibrationResult> getUploadCalibMethod;
    if ((getUploadCalibMethod = EnvironmentalSensorServiceGrpc.getUploadCalibMethod) == null) {
      synchronized (EnvironmentalSensorServiceGrpc.class) {
        if ((getUploadCalibMethod = EnvironmentalSensorServiceGrpc.getUploadCalibMethod) == null) {
          EnvironmentalSensorServiceGrpc.getUploadCalibMethod = getUploadCalibMethod =
              io.grpc.MethodDescriptor.<sensor.Environment.CalibrationData, sensor.Environment.CalibrationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadCalib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.CalibrationData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.CalibrationResult.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentalSensorServiceMethodDescriptorSupplier("UploadCalib"))
              .build();
        }
      }
    }
    return getUploadCalibMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sensor.Environment.TuneCmd,
      sensor.Environment.SensorReading> getLiveTuningMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveTuning",
      requestType = sensor.Environment.TuneCmd.class,
      responseType = sensor.Environment.SensorReading.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<sensor.Environment.TuneCmd,
      sensor.Environment.SensorReading> getLiveTuningMethod() {
    io.grpc.MethodDescriptor<sensor.Environment.TuneCmd, sensor.Environment.SensorReading> getLiveTuningMethod;
    if ((getLiveTuningMethod = EnvironmentalSensorServiceGrpc.getLiveTuningMethod) == null) {
      synchronized (EnvironmentalSensorServiceGrpc.class) {
        if ((getLiveTuningMethod = EnvironmentalSensorServiceGrpc.getLiveTuningMethod) == null) {
          EnvironmentalSensorServiceGrpc.getLiveTuningMethod = getLiveTuningMethod =
              io.grpc.MethodDescriptor.<sensor.Environment.TuneCmd, sensor.Environment.SensorReading>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveTuning"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.TuneCmd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensor.Environment.SensorReading.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentalSensorServiceMethodDescriptorSupplier("LiveTuning"))
              .build();
        }
      }
    }
    return getLiveTuningMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentalSensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentalSensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentalSensorServiceStub>() {
        @java.lang.Override
        public EnvironmentalSensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentalSensorServiceStub(channel, callOptions);
        }
      };
    return EnvironmentalSensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentalSensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentalSensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentalSensorServiceBlockingStub>() {
        @java.lang.Override
        public EnvironmentalSensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentalSensorServiceBlockingStub(channel, callOptions);
        }
      };
    return EnvironmentalSensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentalSensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentalSensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentalSensorServiceFutureStub>() {
        @java.lang.Override
        public EnvironmentalSensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentalSensorServiceFutureStub(channel, callOptions);
        }
      };
    return EnvironmentalSensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnvironmentalSensorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getReading(sensor.Environment.GetReadingRequest request,
        io.grpc.stub.StreamObserver<sensor.Environment.SensorReading> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReadingMethod(), responseObserver);
    }

    /**
     */
    public void streamReadings(sensor.Environment.GetReadingRequest request,
        io.grpc.stub.StreamObserver<sensor.Environment.SensorReading> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamReadingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sensor.Environment.CalibrationData> uploadCalib(
        io.grpc.stub.StreamObserver<sensor.Environment.CalibrationResult> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadCalibMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sensor.Environment.TuneCmd> liveTuning(
        io.grpc.stub.StreamObserver<sensor.Environment.SensorReading> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLiveTuningMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetReadingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sensor.Environment.GetReadingRequest,
                sensor.Environment.SensorReading>(
                  this, METHODID_GET_READING)))
          .addMethod(
            getStreamReadingsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sensor.Environment.GetReadingRequest,
                sensor.Environment.SensorReading>(
                  this, METHODID_STREAM_READINGS)))
          .addMethod(
            getUploadCalibMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                sensor.Environment.CalibrationData,
                sensor.Environment.CalibrationResult>(
                  this, METHODID_UPLOAD_CALIB)))
          .addMethod(
            getLiveTuningMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                sensor.Environment.TuneCmd,
                sensor.Environment.SensorReading>(
                  this, METHODID_LIVE_TUNING)))
          .build();
    }
  }

  /**
   */
  public static final class EnvironmentalSensorServiceStub extends io.grpc.stub.AbstractAsyncStub<EnvironmentalSensorServiceStub> {
    private EnvironmentalSensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalSensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentalSensorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getReading(sensor.Environment.GetReadingRequest request,
        io.grpc.stub.StreamObserver<sensor.Environment.SensorReading> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReadingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamReadings(sensor.Environment.GetReadingRequest request,
        io.grpc.stub.StreamObserver<sensor.Environment.SensorReading> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamReadingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sensor.Environment.CalibrationData> uploadCalib(
        io.grpc.stub.StreamObserver<sensor.Environment.CalibrationResult> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadCalibMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sensor.Environment.TuneCmd> liveTuning(
        io.grpc.stub.StreamObserver<sensor.Environment.SensorReading> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLiveTuningMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EnvironmentalSensorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnvironmentalSensorServiceBlockingStub> {
    private EnvironmentalSensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalSensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentalSensorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sensor.Environment.SensorReading getReading(sensor.Environment.GetReadingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReadingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sensor.Environment.SensorReading> streamReadings(
        sensor.Environment.GetReadingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamReadingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnvironmentalSensorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnvironmentalSensorServiceFutureStub> {
    private EnvironmentalSensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalSensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentalSensorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sensor.Environment.SensorReading> getReading(
        sensor.Environment.GetReadingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReadingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_READING = 0;
  private static final int METHODID_STREAM_READINGS = 1;
  private static final int METHODID_UPLOAD_CALIB = 2;
  private static final int METHODID_LIVE_TUNING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnvironmentalSensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvironmentalSensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_READING:
          serviceImpl.getReading((sensor.Environment.GetReadingRequest) request,
              (io.grpc.stub.StreamObserver<sensor.Environment.SensorReading>) responseObserver);
          break;
        case METHODID_STREAM_READINGS:
          serviceImpl.streamReadings((sensor.Environment.GetReadingRequest) request,
              (io.grpc.stub.StreamObserver<sensor.Environment.SensorReading>) responseObserver);
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
        case METHODID_UPLOAD_CALIB:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadCalib(
              (io.grpc.stub.StreamObserver<sensor.Environment.CalibrationResult>) responseObserver);
        case METHODID_LIVE_TUNING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveTuning(
              (io.grpc.stub.StreamObserver<sensor.Environment.SensorReading>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnvironmentalSensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentalSensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sensor.Environment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentalSensorService");
    }
  }

  private static final class EnvironmentalSensorServiceFileDescriptorSupplier
      extends EnvironmentalSensorServiceBaseDescriptorSupplier {
    EnvironmentalSensorServiceFileDescriptorSupplier() {}
  }

  private static final class EnvironmentalSensorServiceMethodDescriptorSupplier
      extends EnvironmentalSensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvironmentalSensorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnvironmentalSensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentalSensorServiceFileDescriptorSupplier())
              .addMethod(getGetReadingMethod())
              .addMethod(getStreamReadingsMethod())
              .addMethod(getUploadCalibMethod())
              .addMethod(getLiveTuningMethod())
              .build();
        }
      }
    }
    return result;
  }
}

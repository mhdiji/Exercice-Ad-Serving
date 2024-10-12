import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * defining the service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: ImpressionAdService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImpressionAdServiceGrpc {

  private ImpressionAdServiceGrpc() {}

  public static final String SERVICE_NAME = "ImpressionAdService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<IncrementImpressionAdRequest,
      IncrementImpressionAdResponse> getIncrementImpressionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncrementImpression",
      requestType = IncrementImpressionAdRequest.class,
      responseType = IncrementImpressionAdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<IncrementImpressionAdRequest,
      IncrementImpressionAdResponse> getIncrementImpressionMethod() {
    io.grpc.MethodDescriptor<IncrementImpressionAdRequest, IncrementImpressionAdResponse> getIncrementImpressionMethod;
    if ((getIncrementImpressionMethod = ImpressionAdServiceGrpc.getIncrementImpressionMethod) == null) {
      synchronized (ImpressionAdServiceGrpc.class) {
        if ((getIncrementImpressionMethod = ImpressionAdServiceGrpc.getIncrementImpressionMethod) == null) {
          ImpressionAdServiceGrpc.getIncrementImpressionMethod = getIncrementImpressionMethod =
              io.grpc.MethodDescriptor.<IncrementImpressionAdRequest, IncrementImpressionAdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncrementImpression"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  IncrementImpressionAdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  IncrementImpressionAdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImpressionAdServiceMethodDescriptorSupplier("IncrementImpression"))
              .build();
        }
      }
    }
    return getIncrementImpressionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImpressionAdServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImpressionAdServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImpressionAdServiceStub>() {
        @java.lang.Override
        public ImpressionAdServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImpressionAdServiceStub(channel, callOptions);
        }
      };
    return ImpressionAdServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImpressionAdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImpressionAdServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImpressionAdServiceBlockingStub>() {
        @java.lang.Override
        public ImpressionAdServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImpressionAdServiceBlockingStub(channel, callOptions);
        }
      };
    return ImpressionAdServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImpressionAdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImpressionAdServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImpressionAdServiceFutureStub>() {
        @java.lang.Override
        public ImpressionAdServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImpressionAdServiceFutureStub(channel, callOptions);
        }
      };
    return ImpressionAdServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * defining the service
   * </pre>
   */
  public static abstract class ImpressionAdServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void incrementImpression(IncrementImpressionAdRequest request,
        io.grpc.stub.StreamObserver<IncrementImpressionAdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncrementImpressionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIncrementImpressionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                IncrementImpressionAdRequest,
                IncrementImpressionAdResponse>(
                  this, METHODID_INCREMENT_IMPRESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * defining the service
   * </pre>
   */
  public static final class ImpressionAdServiceStub extends io.grpc.stub.AbstractAsyncStub<ImpressionAdServiceStub> {
    private ImpressionAdServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImpressionAdServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImpressionAdServiceStub(channel, callOptions);
    }

    /**
     */
    public void incrementImpression(IncrementImpressionAdRequest request,
        io.grpc.stub.StreamObserver<IncrementImpressionAdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncrementImpressionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * defining the service
   * </pre>
   */
  public static final class ImpressionAdServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImpressionAdServiceBlockingStub> {
    private ImpressionAdServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImpressionAdServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImpressionAdServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public IncrementImpressionAdResponse incrementImpression(IncrementImpressionAdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncrementImpressionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * defining the service
   * </pre>
   */
  public static final class ImpressionAdServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ImpressionAdServiceFutureStub> {
    private ImpressionAdServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImpressionAdServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImpressionAdServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<IncrementImpressionAdResponse> incrementImpression(
        IncrementImpressionAdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncrementImpressionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCREMENT_IMPRESSION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImpressionAdServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImpressionAdServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INCREMENT_IMPRESSION:
          serviceImpl.incrementImpression((IncrementImpressionAdRequest) request,
              (io.grpc.stub.StreamObserver<IncrementImpressionAdResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImpressionAdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImpressionAdServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ImpressionAdServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImpressionAdService");
    }
  }

  private static final class ImpressionAdServiceFileDescriptorSupplier
      extends ImpressionAdServiceBaseDescriptorSupplier {
    ImpressionAdServiceFileDescriptorSupplier() {}
  }

  private static final class ImpressionAdServiceMethodDescriptorSupplier
      extends ImpressionAdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImpressionAdServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImpressionAdServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImpressionAdServiceFileDescriptorSupplier())
              .addMethod(getIncrementImpressionMethod())
              .build();
        }
      }
    }
    return result;
  }
}

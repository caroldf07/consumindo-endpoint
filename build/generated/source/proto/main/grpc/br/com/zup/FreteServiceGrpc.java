package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: frete.proto")
public final class FreteServiceGrpc {

  private FreteServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.FreteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.FreteRequest,
      br.com.zup.FreteReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = br.com.zup.FreteRequest.class,
      responseType = br.com.zup.FreteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.FreteRequest,
      br.com.zup.FreteReply> getSendMethod() {
    io.grpc.MethodDescriptor<br.com.zup.FreteRequest, br.com.zup.FreteReply> getSendMethod;
    if ((getSendMethod = FreteServiceGrpc.getSendMethod) == null) {
      synchronized (FreteServiceGrpc.class) {
        if ((getSendMethod = FreteServiceGrpc.getSendMethod) == null) {
          FreteServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<br.com.zup.FreteRequest, br.com.zup.FreteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.FreteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.FreteReply.getDefaultInstance()))
              .setSchemaDescriptor(new FreteServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.CalculaFreteRequest,
      br.com.zup.CalculaFreteResponse> getCalculaFreteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculaFrete",
      requestType = br.com.zup.CalculaFreteRequest.class,
      responseType = br.com.zup.CalculaFreteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.CalculaFreteRequest,
      br.com.zup.CalculaFreteResponse> getCalculaFreteMethod() {
    io.grpc.MethodDescriptor<br.com.zup.CalculaFreteRequest, br.com.zup.CalculaFreteResponse> getCalculaFreteMethod;
    if ((getCalculaFreteMethod = FreteServiceGrpc.getCalculaFreteMethod) == null) {
      synchronized (FreteServiceGrpc.class) {
        if ((getCalculaFreteMethod = FreteServiceGrpc.getCalculaFreteMethod) == null) {
          FreteServiceGrpc.getCalculaFreteMethod = getCalculaFreteMethod =
              io.grpc.MethodDescriptor.<br.com.zup.CalculaFreteRequest, br.com.zup.CalculaFreteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculaFrete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.CalculaFreteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.CalculaFreteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FreteServiceMethodDescriptorSupplier("calculaFrete"))
              .build();
        }
      }
    }
    return getCalculaFreteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FreteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FreteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FreteServiceStub>() {
        @java.lang.Override
        public FreteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FreteServiceStub(channel, callOptions);
        }
      };
    return FreteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FreteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FreteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FreteServiceBlockingStub>() {
        @java.lang.Override
        public FreteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FreteServiceBlockingStub(channel, callOptions);
        }
      };
    return FreteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FreteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FreteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FreteServiceFutureStub>() {
        @java.lang.Override
        public FreteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FreteServiceFutureStub(channel, callOptions);
        }
      };
    return FreteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FreteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(br.com.zup.FreteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.FreteReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     */
    public void calculaFrete(br.com.zup.CalculaFreteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.CalculaFreteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculaFreteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.FreteRequest,
                br.com.zup.FreteReply>(
                  this, METHODID_SEND)))
          .addMethod(
            getCalculaFreteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.CalculaFreteRequest,
                br.com.zup.CalculaFreteResponse>(
                  this, METHODID_CALCULA_FRETE)))
          .build();
    }
  }

  /**
   */
  public static final class FreteServiceStub extends io.grpc.stub.AbstractAsyncStub<FreteServiceStub> {
    private FreteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FreteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FreteServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(br.com.zup.FreteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.FreteReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculaFrete(br.com.zup.CalculaFreteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.CalculaFreteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculaFreteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FreteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FreteServiceBlockingStub> {
    private FreteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FreteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FreteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.FreteReply send(br.com.zup.FreteRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.CalculaFreteResponse calculaFrete(br.com.zup.CalculaFreteRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculaFreteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FreteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FreteServiceFutureStub> {
    private FreteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FreteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FreteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.FreteReply> send(
        br.com.zup.FreteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.CalculaFreteResponse> calculaFrete(
        br.com.zup.CalculaFreteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculaFreteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_CALCULA_FRETE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FreteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FreteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((br.com.zup.FreteRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.FreteReply>) responseObserver);
          break;
        case METHODID_CALCULA_FRETE:
          serviceImpl.calculaFrete((br.com.zup.CalculaFreteRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.CalculaFreteResponse>) responseObserver);
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

  private static abstract class FreteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FreteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.Frete.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FreteService");
    }
  }

  private static final class FreteServiceFileDescriptorSupplier
      extends FreteServiceBaseDescriptorSupplier {
    FreteServiceFileDescriptorSupplier() {}
  }

  private static final class FreteServiceMethodDescriptorSupplier
      extends FreteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FreteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FreteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FreteServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getCalculaFreteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

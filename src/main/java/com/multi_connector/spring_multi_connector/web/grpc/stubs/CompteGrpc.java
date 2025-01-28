package com.multi_connector.spring_multi_connector.web.grpc.stubs;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: schema.proto")
public final class CompteGrpc {

  private CompteGrpc() {}

  public static final String SERVICE_NAME = "Compte";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getGetCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompte",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getGetCompteMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getGetCompteMethod;
    if ((getGetCompteMethod = CompteGrpc.getGetCompteMethod) == null) {
      synchronized (CompteGrpc.class) {
        if ((getGetCompteMethod = CompteGrpc.getGetCompteMethod) == null) {
          CompteGrpc.getGetCompteMethod = getGetCompteMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Compte", "getCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteMethodDescriptorSupplier("getCompte"))
                  .build();
          }
        }
     }
     return getGetCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getListeComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listeComptes",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getListeComptesMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getListeComptesMethod;
    if ((getListeComptesMethod = CompteGrpc.getListeComptesMethod) == null) {
      synchronized (CompteGrpc.class) {
        if ((getListeComptesMethod = CompteGrpc.getListeComptesMethod) == null) {
          CompteGrpc.getListeComptesMethod = getListeComptesMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Compte", "listeComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteMethodDescriptorSupplier("listeComptes"))
                  .build();
          }
        }
     }
     return getListeComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCompte",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteGrpc.class) {
        if ((getSaveCompteMethod = CompteGrpc.getSaveCompteMethod) == null) {
          CompteGrpc.getSaveCompteMethod = getSaveCompteMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Compte", "saveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteMethodDescriptorSupplier("saveCompte"))
                  .build();
          }
        }
     }
     return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getUpdateCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCompte",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getUpdateCompteMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getUpdateCompteMethod;
    if ((getUpdateCompteMethod = CompteGrpc.getUpdateCompteMethod) == null) {
      synchronized (CompteGrpc.class) {
        if ((getUpdateCompteMethod = CompteGrpc.getUpdateCompteMethod) == null) {
          CompteGrpc.getUpdateCompteMethod = getUpdateCompteMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Compte", "updateCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteMethodDescriptorSupplier("updateCompte"))
                  .build();
          }
        }
     }
     return getUpdateCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCompte",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteGrpc.class) {
        if ((getDeleteCompteMethod = CompteGrpc.getDeleteCompteMethod) == null) {
          CompteGrpc.getDeleteCompteMethod = getDeleteCompteMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Compte", "deleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteMethodDescriptorSupplier("deleteCompte"))
                  .build();
          }
        }
     }
     return getDeleteCompteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteStub newStub(io.grpc.Channel channel) {
    return new CompteStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteFutureStub(channel);
  }

  /**
   */
  public static abstract class CompteImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Compte Crud operations
     * </pre>
     */
    public void getCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void listeComptes(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListeComptesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void saveCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void updateCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void deleteCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>(
                  this, METHODID_GET_COMPTE)))
          .addMethod(
            getListeComptesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>(
                  this, METHODID_LISTE_COMPTES)))
          .addMethod(
            getSaveCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>(
                  this, METHODID_SAVE_COMPTE)))
          .addMethod(
            getUpdateCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>(
                  this, METHODID_UPDATE_COMPTE)))
          .addMethod(
            getDeleteCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity>(
                  this, METHODID_DELETE_COMPTE)))
          .build();
    }
  }

  /**
   */
  public static final class CompteStub extends io.grpc.stub.AbstractStub<CompteStub> {
    private CompteStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteStub(channel, callOptions);
    }

    /**
     * <pre>
     * Compte Crud operations
     * </pre>
     */
    public void getCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void listeComptes(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListeComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void saveCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void updateCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void deleteCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompteBlockingStub extends io.grpc.stub.AbstractStub<CompteBlockingStub> {
    private CompteBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Compte Crud operations
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse getCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public java.util.Iterator<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> listeComptes(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListeComptesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse saveCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse updateCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity deleteCompte(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompteFutureStub extends io.grpc.stub.AbstractStub<CompteFutureStub> {
    private CompteFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Compte Crud operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> getCompte(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> saveCompte(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse> updateCompte(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> deleteCompte(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COMPTE = 0;
  private static final int METHODID_LISTE_COMPTES = 1;
  private static final int METHODID_SAVE_COMPTE = 2;
  private static final int METHODID_UPDATE_COMPTE = 3;
  private static final int METHODID_DELETE_COMPTE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COMPTE:
          serviceImpl.getCompte((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>) responseObserver);
          break;
        case METHODID_LISTE_COMPTES:
          serviceImpl.listeComptes((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPTE:
          serviceImpl.updateCompte((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity>) responseObserver);
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

  private static abstract class CompteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Compte");
    }
  }

  private static final class CompteFileDescriptorSupplier
      extends CompteBaseDescriptorSupplier {
    CompteFileDescriptorSupplier() {}
  }

  private static final class CompteMethodDescriptorSupplier
      extends CompteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteFileDescriptorSupplier())
              .addMethod(getGetCompteMethod())
              .addMethod(getListeComptesMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getUpdateCompteMethod())
              .addMethod(getDeleteCompteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

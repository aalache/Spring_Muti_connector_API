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
public final class ClientGrpc {

  private ClientGrpc() {}

  public static final String SERVICE_NAME = "Client";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getGetClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getClient",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getGetClientMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getGetClientMethod;
    if ((getGetClientMethod = ClientGrpc.getGetClientMethod) == null) {
      synchronized (ClientGrpc.class) {
        if ((getGetClientMethod = ClientGrpc.getGetClientMethod) == null) {
          ClientGrpc.getGetClientMethod = getGetClientMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Client", "getClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientMethodDescriptorSupplier("getClient"))
                  .build();
          }
        }
     }
     return getGetClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getListeClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listeClients",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getListeClientsMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getListeClientsMethod;
    if ((getListeClientsMethod = ClientGrpc.getListeClientsMethod) == null) {
      synchronized (ClientGrpc.class) {
        if ((getListeClientsMethod = ClientGrpc.getListeClientsMethod) == null) {
          ClientGrpc.getListeClientsMethod = getListeClientsMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Client", "listeClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientMethodDescriptorSupplier("listeClients"))
                  .build();
          }
        }
     }
     return getListeClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getSaveClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveClient",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getSaveClientMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getSaveClientMethod;
    if ((getSaveClientMethod = ClientGrpc.getSaveClientMethod) == null) {
      synchronized (ClientGrpc.class) {
        if ((getSaveClientMethod = ClientGrpc.getSaveClientMethod) == null) {
          ClientGrpc.getSaveClientMethod = getSaveClientMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Client", "saveClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientMethodDescriptorSupplier("saveClient"))
                  .build();
          }
        }
     }
     return getSaveClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateClient",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientGrpc.class) {
        if ((getUpdateClientMethod = ClientGrpc.getUpdateClientMethod) == null) {
          ClientGrpc.getUpdateClientMethod = getUpdateClientMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Client", "updateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientMethodDescriptorSupplier("updateClient"))
                  .build();
          }
        }
     }
     return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteClient",
      requestType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.class,
      responseType = com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
      com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> getDeleteClientMethod;
    if ((getDeleteClientMethod = ClientGrpc.getDeleteClientMethod) == null) {
      synchronized (ClientGrpc.class) {
        if ((getDeleteClientMethod = ClientGrpc.getDeleteClientMethod) == null) {
          ClientGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest, com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Client", "deleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientMethodDescriptorSupplier("deleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientStub newStub(io.grpc.Channel channel) {
    return new ClientStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client Crud operations
     * </pre>
     */
    public void getClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void listeClients(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListeClientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void saveClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void updateClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void deleteClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>(
                  this, METHODID_GET_CLIENT)))
          .addMethod(
            getListeClientsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>(
                  this, METHODID_LISTE_CLIENTS)))
          .addMethod(
            getSaveClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>(
                  this, METHODID_SAVE_CLIENT)))
          .addMethod(
            getUpdateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>(
                  this, METHODID_UPDATE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest,
                com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity>(
                  this, METHODID_DELETE_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class ClientStub extends io.grpc.stub.AbstractStub<ClientStub> {
    private ClientStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Crud operations
     * </pre>
     */
    public void getClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void listeClients(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListeClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void saveClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void updateClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public void deleteClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request,
        io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientBlockingStub extends io.grpc.stub.AbstractStub<ClientBlockingStub> {
    private ClientBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Crud operations
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse getClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public java.util.Iterator<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> listeClients(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListeClientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse saveClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse updateClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity deleteClient(com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientFutureStub extends io.grpc.stub.AbstractStub<ClientFutureStub> {
    private ClientFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Crud operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> getClient(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> saveClient(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse> updateClient(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity> deleteClient(
        com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CLIENT = 0;
  private static final int METHODID_LISTE_CLIENTS = 1;
  private static final int METHODID_SAVE_CLIENT = 2;
  private static final int METHODID_UPDATE_CLIENT = 3;
  private static final int METHODID_DELETE_CLIENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CLIENT:
          serviceImpl.getClient((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>) responseObserver);
          break;
        case METHODID_LISTE_CLIENTS:
          serviceImpl.listeClients((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>) responseObserver);
          break;
        case METHODID_SAVE_CLIENT:
          serviceImpl.saveClient((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ClientRequest) request,
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

  private static abstract class ClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Client");
    }
  }

  private static final class ClientFileDescriptorSupplier
      extends ClientBaseDescriptorSupplier {
    ClientFileDescriptorSupplier() {}
  }

  private static final class ClientMethodDescriptorSupplier
      extends ClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientFileDescriptorSupplier())
              .addMethod(getGetClientMethod())
              .addMethod(getListeClientsMethod())
              .addMethod(getSaveClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getDeleteClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}

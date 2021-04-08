package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/GrpcClientFactory;", "", "()V", "fretesClientStub", "Lbr/com/zup/FreteServiceGrpc$FreteServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "consumindo-endpoint"})
@io.micronaut.context.annotation.Factory()
public final class GrpcClientFactory {
    
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Singleton()
    public final br.com.zup.FreteServiceGrpc.FreteServiceBlockingStub fretesClientStub(@org.jetbrains.annotations.NotNull()
    @io.micronaut.grpc.annotation.GrpcChannel(value = "frete")
    io.grpc.ManagedChannel channel) {
        return null;
    }
    
    public GrpcClientFactory() {
        super();
    }
}
package br.com.zup

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

//Essa annotation serve para que o Micronaut entenda que essa é uma classe de fábrica
@Factory
class GrpcClientFactory {

    @Singleton
    fun fretesClientStub(@GrpcChannel("frete") channel: ManagedChannel): FreteServiceGrpc.FreteServiceBlockingStub? {
        //O @GrpcChannel é uma annotation do Micronaut para facilitar a criação do Client
        return FreteServiceGrpc
            .newBlockingStub(channel)
    }
}
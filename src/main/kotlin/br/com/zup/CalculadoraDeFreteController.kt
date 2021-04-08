package br.com.zup

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import javax.inject.Inject

@Controller
class CalculadoraDeFreteController(@Inject val gRpcClient: FreteServiceGrpc.FreteServiceBlockingStub) {

    @Get("/api/fretes")
    fun calcula(@QueryValue cep: String): FreteResponse {
        val request = CalculaFreteRequest.newBuilder()
            .setCep(cep)
            .build()

        /*Aqui é bem semelhante ao OpenFeign, depois que fazemos a configuração,
         temos que chamá-lo para que haja a requisição e o recebimento da resposta*/
        val response = gRpcClient.calculaFrete(request)

        return FreteResponse(
            cep = response.cep,
            valor = response.valor
        )
    }


}

data class FreteResponse(
    val cep: String,
    val valor: Double
) {}
package models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCodigoPostal {


    public Enderecoo buscarEndereco(String codigoPostall){
        URI endereco = URI.create("https://viacep.com.br/ws/" + codigoPostall + "/json/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try{
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Enderecoo.class);
        }
        catch (Exception e){
            throw new RuntimeException("Não consegui obter o endereço a partir desse Codigo Postal");
        }

    }
}

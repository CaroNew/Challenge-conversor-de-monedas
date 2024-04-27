package api.conversor.utils;
import com.google.gson.Gson;
import api.conversor.models.CurrencyConversor;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class SearchCurrency {
    private String rute = "https://v6.exchangerate-api.com/v6/2b2163007b1c842b2f47d4b3/pair/";

    public SearchCurrency(String currency1, String currency2) {
        // controlar que los strings sean correctos
        this.rute += currency1 + "/" + currency2;
    }

    public String getRute() {
        return this.rute;
    }

    public CurrencyConversor search (){
        String rute = getRute();
        //1. crear httpclient
        HttpClient client = HttpClient.newHttpClient() ;
        //2. crear la solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rute))
                .GET()
                .build();

        //3. recibiendo la respuesta
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), CurrencyConversor.class);
        } catch (Exception e) {
            throw new RuntimeException("Something happen...");
        }

    }

}

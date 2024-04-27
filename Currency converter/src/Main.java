import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static String createRute(String currency1, String currency2){
        String rute = "https://v6.exchangerate-api.com/v6/2b2163007b1c842b2f47d4b3/pair/";
        // controlar que los strings sean correctos
        rute += currency1 + "/" + currency2;
        return rute;
    }


    public static void main(String[] args) {
        //https://v6.exchangerate-api.com/v6/2b2163007b1c842b2f47d4b3/latest/USD

        String rute = createRute("USD", "ARS");
        //1. crear httpclient
        HttpClient client = HttpClient.newHttpClient() ;
        //2. crear la solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rute))
                .GET()
                .build();

        //3. recibiendo la respuesta
        try {
            HttpResponse response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Crear modulo para las consultas!!!

        //5. filtrando las monedas
        //6. convirtiendo las monedas
        //7. menu de usuario

    }
}
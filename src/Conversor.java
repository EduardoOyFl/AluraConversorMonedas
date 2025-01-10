import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Moneda getConversion(String origen, String destino, double cantidad){

        String apiKey = "e696a2dc9210d41b412b94f6";
        String url_base = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/";

        URI direccion = URI.create(url_base + origen + "/" + destino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Error de comunicacion con la API: " + e.getMessage());
        }
    }
}
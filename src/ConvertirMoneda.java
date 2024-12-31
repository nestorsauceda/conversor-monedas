import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConvertirMoneda {

    private static final String API_KEY = "54f5d993aed0e4bea0378c7c";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public static void convertir(String from, String to, double cantidad) {
        try {
            String url = API_URL + API_KEY + "/pair/" + from + "/" + to;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            if ("success".equals(jsonResponse.get("result").getAsString())) {
                double conversionRate = jsonResponse.get("conversion_rate").getAsDouble();
                double convertedAmount = cantidad * conversionRate;
                System.out.printf("\n$%.2f %s --equivale a--> $%.2f %s\n", cantidad, from, convertedAmount, to);
            } else {
                System.out.println("Error al obtener la tasa de cambio. Intente más tarde.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}

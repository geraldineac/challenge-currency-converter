import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorDolarAMonedas {
    static void convertirDolar(String pais) {
        Scanner leer = new Scanner(System.in);
        double monto = leer.nextDouble();
        String direccion = "https://v6.exchangerate-api.com/v6/c349e9cbba3abfeb882a724c/pair/USD/" + pais + "/" + monto;
        try {
            //HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //La respuesta del body de la API
            //System.out.println(response.body());
            String json = response.body();
            //GSON
            Gson gson = new GsonBuilder()
                    .create();

            //Utilizando el Java Record
            ConversorDatos miConversor = gson.fromJson(json, ConversorDatos.class);

            System.out.println("------------------------------------");
            System.out.println("|  Su valor en dólares $" + monto + " se convirtió a $" + miConversor.conversion_result() + "  |");
            System.out.println("------------------------------------");

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

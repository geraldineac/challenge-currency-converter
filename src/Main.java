import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Main {
    public static void main(String[] args) {

                // Reemplaza 'YOUR-API-KEY' con tu clave de API real
                String url_str = "https://v6.exchangerate-api.com/v6/c349e9cbba3abfeb882a724c/latest/USD";

                try {
                    // Creando la URL y abriendo la conexión
                    URL url = new URL(url_str);
                    HttpURLConnection request = (HttpURLConnection) url.openConnection();
                    request.connect();

                    // Convirtiendo la respuesta a JSON
                    JsonParser jp = new JsonParser();
                    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                    JsonObject jsonobj = root.getAsJsonObject();

                    // Accediendo al objeto y extrayendo el resultado
                    String req_result = jsonobj.get("result").getAsString();

                    // Aquí puedes continuar con el procesamiento del resultado como lo necesites
                    System.out.println("Resultado: " + req_result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

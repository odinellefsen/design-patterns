package designpatterns5041.assignment06;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import designpatterns5041.assignment06.models.Task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class JsonPlaceholderApi {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/todos";
    private static final Gson gson = new Gson();

    public List<Task> getTasks() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Convert JSON response to List<Task>
                return fromJsonToList(response.toString(), Task.class);
            } else {
                System.out.println("GET request not worked");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static <T> List<T> fromJsonToList(String json, Class<T> clazz) {
        return gson.fromJson(json, TypeToken.getParameterized(List.class, clazz).getType());
    }
}

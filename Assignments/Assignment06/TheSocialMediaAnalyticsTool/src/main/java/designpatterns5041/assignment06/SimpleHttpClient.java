package designpatterns5041.assignment06;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// +-------------------------------+
// | You can NOT change this class |
// +-------------------------------+
public final class SimpleHttpClient {
    private final java.net.http.HttpClient httpClient = java.net.http.HttpClient.newHttpClient();

    public String get(String url) throws Exception {
        long startTime = System.currentTimeMillis();

        System.out.println("Performing GET request to " + url);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        String result = response.body();
        long endTime = System.currentTimeMillis();
        System.out.println("GET request to " + url + " took " + (endTime - startTime) + " ms");

        return result;
    }
}

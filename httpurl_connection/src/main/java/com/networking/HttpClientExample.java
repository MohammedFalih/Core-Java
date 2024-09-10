package com.networking;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) {
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("http://localhost:4567/employees"))
            .GET()
            .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response code: " + response.statusCode());
            System.out.println("Response body: " + response.body());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

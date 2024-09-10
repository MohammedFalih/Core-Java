package com.networking;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try{
            URI uri = new URI("http://localhost:4567/employees");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int statusCode = connection.getResponseCode();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Status Code: " + statusCode);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

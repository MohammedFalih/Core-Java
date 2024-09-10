package com.networking;
import java.net.URI;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpGetExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://localhost:4567/employees");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int response_code = connection.getResponseCode();
            System.out.println("Response code: " + response_code);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while((inputLine = in.readLine()) != null){
                content.append(inputLine);
            }
            in.close();
            System.out.println(content.toString());
            connection.disconnect();
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}

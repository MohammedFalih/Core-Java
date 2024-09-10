package com.networking;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStream;

public class HttpGetMethod {

    public static void getMethod() throws Exception {
        URI uri = new URI("http://localhost:3000/people");
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect(); // optional to connect
        
        int status_code = connection.getResponseCode();
        System.out.println("Status code: " + status_code);

        String message = connection.getResponseMessage();
        System.out.println("Message: " + message);

        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        StringBuffer data = new StringBuffer();

        while((line=bufferedReader.readLine()) != null) {
            data.append(line);
        }

        System.out.println("Respone data: " + data);

        connection.disconnect();
    }

    public static void postMethod() throws Exception{
        URI uri = new URI("http://localhost:3000/people");
        URL url = uri.toURL();
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String jsonBody = "{\"first_name\":\"Mike\", \"last_name\":\"Tyson\", \"company\":\"Prime\"}";
        byte[] inputJson = jsonBody.getBytes();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(inputJson);

        System.out.println("Response code:" + connection.getResponseCode());
        System.out.println("Response message: " + connection.getResponseMessage());

        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String line;
        StringBuffer buffer = new StringBuffer();
        while((line=bufferedReader.readLine()) != null){
            buffer.append(line);
        }
        System.out.println(buffer);
    }

    public static void putMethod() throws Exception{
        //f1d7
        URI uri = new URI("http://localhost:3000/people/f1d7");
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String jsonBody = "{\"first_name\":\"Mike\", \"last_name\":\"Tyson\", \"company\":\"Tyson-2.0\"}";
        byte[] inputJson = jsonBody.getBytes();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(inputJson);

        System.out.println("Response code:" + connection.getResponseCode());
        System.out.println("Response message: " + connection.getResponseMessage());

        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        StringBuilder builder = new StringBuilder();
        while ((line=bufferedReader.readLine()) != null) {
            builder.append(line);
        }

        System.out.println("Output: " + builder.toString());
    }

    public static void deleteMethod() throws Exception{
        URI uri = new URI("http://localhost:3000/people/f1d7");
        URL url = uri.toURL();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.getDoOutput();

        System.out.println("Response code: " + connection.getResponseCode());
        System.out.println("Response message: " + connection.getResponseMessage());

        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = reader.readLine();
        StringBuffer read = new StringBuffer();

        while (line != null) {
            read.append(line);
        }

        System.out.println(read);
    }

    public static void main(String[] args) {
        try {
            HttpGetMethod.getMethod();
            // HttpGetMethod.postMethod();
            // HttpGetMethod.putMethod();
            // HttpGetMethod.deleteMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.socket_server;

import java.net.*;
import java.io.*;

public class ClientSide {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8090;

        try (Socket socket = new Socket(hostname, port)) {
            
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello, Server!");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String response = reader.readLine();
            System.out.println("Server Response: " + response);
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}

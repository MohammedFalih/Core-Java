package com.socket_server;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8090)) {
            System.out.println("Server is listening on port 8090");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected.");

                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String message = reader.readLine();
                System.out.println("Received: " + message);

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("Hello client :)");

                socket.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

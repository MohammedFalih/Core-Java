import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws Exception {
        String ip = "localhost";
        int port = 3030;

        String client_name = "Mohammed Falih";

        Socket socket = new Socket(ip, port);

        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(client_name);
        out.flush();
        
        System.out.println("C : client sent the data to server...");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverData = br.readLine();
        System.out.println("Server sent data: " + serverData);
        socket.close();
    }
}

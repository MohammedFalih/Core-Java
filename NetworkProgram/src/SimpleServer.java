import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SimpleServer {
    public static void main(String[] args) throws Exception{
        System.out.println("S : Server started...");
        ServerSocket ss = new ServerSocket(3030);

        System.out.println("S : Server is waiting for client request...");
        Socket s = ss.accept();

        System.out.println("S : Server connected to client...");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String clientData = br.readLine();
        System.out.println("S : Client Data: " + clientData);

        String nickName = clientData.substring(9, 14);

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.write(nickName);
        out.flush();

        ss.close();
    }
}
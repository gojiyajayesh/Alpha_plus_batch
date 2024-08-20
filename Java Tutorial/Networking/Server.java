import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept(); // Connection Done
        DataInputStream input = new DataInputStream(s.getInputStream());
        String data=(String)input.readUTF();
        System.out.println("Message Of Client : "+data);
        ss.close();
    }
}

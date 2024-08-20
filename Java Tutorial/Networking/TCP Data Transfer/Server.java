import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(3333);
        Socket socket = serverSocket.accept(); // Connection Done

        // DataInput and DataOutput

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        // Reader For read data from Console

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String myData = "", clientData = "";
        while (!clientData.equals("stop")) {
            clientData = dis.readUTF();
            System.out.println("Client Says : " + clientData);
            System.out.print("Write Server Message: ");
            myData = reader.readLine();
            dos.writeUTF(myData);
            dos.flush();
        }
        socket.close();
        dis.close();
        dos.close();
        reader.close();
        serverSocket.close();
    }
}
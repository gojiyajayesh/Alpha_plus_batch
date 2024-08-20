import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 3333);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String myData = "", serverData = "";

        while (!myData.equals("stop")) {
            System.out.print("Write Client Message: ");
            myData = reader.readLine();
            dos.writeUTF(myData);
            dos.flush();
            serverData = dis.readUTF();
            System.out.println("Server Says : " + serverData);
        }
        dis.close();
        dos.close();
        reader.close();
        socket.close();
    }
}

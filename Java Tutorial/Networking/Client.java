import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",6666);
        DataOutputStream output=new DataOutputStream(s.getOutputStream());
        output.writeUTF("Hello Jayesh");
        output.flush();
        output.close();
        s.close();
    }
}

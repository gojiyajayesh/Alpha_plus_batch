import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "Hello  ";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        for (int i = 0; i < 1000; i++) {
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            ds.send(dp);
            str="Hello"+i;
            if(i==998){
                str="stop";
            }
        }
        ds.close();
    }
}
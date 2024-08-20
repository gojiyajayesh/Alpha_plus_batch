import java.io.IOException;
import java.net.URL;

public class URLClass {
    public static void main(String[] args) throws IOException{
        @SuppressWarnings("deprecation")
        URL url=new URL("http://www.javatpoint.com/java-tutorial");
        System.out.println("Protocol:"+url.getProtocol());
        System.out.println("Host:"+url.getHost());
        System.out.println("Port :"+url.getPort());
        System.out.println("File:"+url.getFile());
        System.out.println("String :"+url.toString());
    }
}

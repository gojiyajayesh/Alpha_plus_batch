import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionClass {
    public static void main(String[] args) throws IOException {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://ldce.ac.in/");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();

            FileOutputStream streamOutput = new FileOutputStream("Jayesh.html");
            BufferedOutputStream stream2 = new BufferedOutputStream(streamOutput);
            int k;
            while ((k = stream.read()) != -1) {
                stream2.write(k);
            }
            stream.close();
            stream2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

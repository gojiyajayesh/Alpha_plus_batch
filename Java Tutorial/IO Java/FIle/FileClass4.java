import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClass4 {
    public static void main(String[] args) throws IOException {
        byte[] data = { 40, 41, 42, 43, 44, 45, 56, 54, 45, 34 };
        FileOutputStream fos = new FileOutputStream("jayesh.txt");
        FileInputStream fis = new FileInputStream("jayesh.txt");

        fos.write(data);
        FileDescriptor fd = fos.getFD();
        fd.sync();
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fos.close();
        fis.close();
    }
}

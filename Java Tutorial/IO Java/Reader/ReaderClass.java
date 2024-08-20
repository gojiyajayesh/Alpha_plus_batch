import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderClass {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader(
                "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\Writer_1.txt");
        int i = 0;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }

        reader.close();
    }
}

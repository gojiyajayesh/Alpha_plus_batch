import java.io.FileReader;

public class FileReaderClass {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader(
                "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\Writer_1.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();
    }
}
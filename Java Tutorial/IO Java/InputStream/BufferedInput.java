import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInput {
    public static void main(String[] args) {
        readByteArray();
        readByteArray2();
    }

    public static void readByteArray() {
        try {
            FileInputStream File = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");

            BufferedInputStream input = new BufferedInputStream(File);
            int i = 0;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }

            input.close();
            File.close();
        } catch (Exception e) {
            System.out.println("Exception Occur..." + e);
        }
    }

    public static void readByteArray2() {
        try {
            FileInputStream File = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");

            BufferedInputStream input = new BufferedInputStream(File);
            byte[] data = new byte[input.available()];
            input.read(data);
            int i = 0;
            while (data.length > i) {
                System.out.print((char) data[i++]);
            }

            input.close();
            File.close();
        } catch (Exception e) {
            System.out.println("Exception Occur..." + e);
        }
    }
}

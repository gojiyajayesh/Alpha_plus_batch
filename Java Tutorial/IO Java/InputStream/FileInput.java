import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) {
        readSingleCharacter();
        readByteArray();
        readByteArray2();
    }

    public static void readSingleCharacter() {
        try {
            FileInputStream File = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");

            int i = File.read();

            System.out.println((char) i);

            File.close();
        } catch (Exception e) {
            System.out.println("Exception Occur..." + e);
        }
    }

    public static void readByteArray() {
        try {
            FileInputStream File = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");
            int i = 0;
            while ((i = File.read()) != -1) {
                System.out.print((char) i);
            }

            File.close();
        } catch (Exception e) {
            System.out.println("Exception Occur..." + e);
        }
    }

    public static void readByteArray2() {
        try {
            FileInputStream File = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");

            byte[] data = new byte[File.available()];
            File.read(data);
            int i = 0;
            while (data.length > i) {
                System.out.print((char) data[i++]);
            }

            File.close();
        } catch (Exception e) {
            System.out.println("Exception Occur..." + e);
        }
    }
}

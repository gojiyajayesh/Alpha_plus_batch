import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutput {
    public static void main(String[] args) {
        writeBufferedFile();
    }

    public static void writeBufferedFile() {
        try {
            FileOutputStream outputFile = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_3.txt");

            BufferedOutputStream bufferedFile = new BufferedOutputStream(outputFile);

            String s = "Hello Jayesh Ahir";

            byte[] data = s.getBytes();

            bufferedFile.write(data);

            // fluse and close buffere
            bufferedFile.flush();
            bufferedFile.close();
            // Close the FileOutputStream
            outputFile.close();

            System.out.println("File is Created Successfuly");

        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}

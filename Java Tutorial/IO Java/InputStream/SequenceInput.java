import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInput {
    public static void main(String[] args) {
        readDataOnMultipulFile();
    }

    public static void readDataOnMultipulFile() {
        try {
            FileInputStream file1 = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");
            FileInputStream file2 = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_3.txt");

            FileOutputStream output = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_4.txt");

            SequenceInputStream stream = new SequenceInputStream(file1, file2);
            int i = 0;
            while ((i = stream.read()) != -1) {
                output.write(i);
            }

            stream.close();
            file1.close();
            file2.close();
            output.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}
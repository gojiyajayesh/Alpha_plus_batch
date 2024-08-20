import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInput {
    public static void main(String[] args) {
        readMultipuleFile();
    }

    @SuppressWarnings("unchecked")
    public static void readMultipuleFile() {
        try {
            FileInputStream file1 = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_1.txt");
            FileInputStream file2 = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");

            FileInputStream file3 = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_3.txt");
            FileInputStream file4 = new FileInputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_4.txt");

            FileOutputStream output = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_5.txt");

            @SuppressWarnings("rawtypes")
            Vector v = new Vector();
            v.add(file1);
            v.add(file2);
            v.add(file3);
            v.add(file4);

            @SuppressWarnings("rawtypes")
            Enumeration enumeration = v.elements();

            SequenceInputStream stream = new SequenceInputStream(enumeration);
            int i = 0;
            while ((i = stream.read()) != -1) {
                output.write(i);
            }

            stream.close();
            file1.close();
            file2.close();
            file3.close();
            file4.close();
            output.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}

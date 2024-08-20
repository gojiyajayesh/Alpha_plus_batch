import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutput {
    public static void main(String[] args) {
        writeOnMultipulFile();
    }
    public static void writeOnMultipulFile(){
         try {
            FileOutputStream file1 = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_6.txt");
            FileOutputStream file2 = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_7.txt");

            
            ByteArrayOutputStream output=new ByteArrayOutputStream();

            String s="My Name Is Jayesh";
             byte[] data=s.getBytes();
            output.write(data);  // Write Single Character

            output.writeTo(file1);
            output.writeTo(file2);

            file1.close();
            file2.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}

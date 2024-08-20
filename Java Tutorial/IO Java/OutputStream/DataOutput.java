import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream file1=new FileOutputStream("E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_8.txt");

        DataOutputStream stream=new DataOutputStream(file1);

        stream.writeInt(65);

        stream.flush();
        stream.close();
        file1.close();
    }
}

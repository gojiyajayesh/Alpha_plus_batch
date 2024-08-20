import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_1.txt");
        int count =file.available();
        byte[] b=new byte[count];

        DataInputStream stream=new DataInputStream(file);

        stream.read(b);

        for(byte x:b){
            System.out.print((char)x+" ");
        }

        stream.close();
        file.close();
    }
}

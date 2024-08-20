import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInput {
    public static void main(String[] args) throws IOException{
        byteArrayRead();
    }
    public static void byteArrayRead() throws IOException{
        byte[] data={34,33,21,32,45,56};

        ByteArrayInputStream s=new ByteArrayInputStream(data);
        int i=0;
        while((i=s.read())!=-1){
            System.out.println("Ascii value "+i+" Character Value "+(char)i);
        }
    }
}

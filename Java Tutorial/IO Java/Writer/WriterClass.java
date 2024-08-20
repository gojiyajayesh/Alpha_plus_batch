import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass {
    public static void main(String[] args) throws IOException{
        Writer w=new FileWriter("E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\Writer_1.txt");
        w.write(new String("Hello Jayesh"));
        w.close();
        System.out.println("Complate..");
    }
}
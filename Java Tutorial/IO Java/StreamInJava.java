import java.io.IOException;

public class StreamInJava {
    public static void main(String[] args) throws IOException{
        // Both are use write in console 
        System.out.println("This is Output Stream...");
        System.err.println("This is Error Stream...");
        // This one is used to read Console data
        int i=System.in.read();
        System.out.println((char)i);

    }
}

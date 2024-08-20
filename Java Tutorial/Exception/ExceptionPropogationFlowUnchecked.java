import java.io.IOException;

public class ExceptionPropogationFlowUnchecked {
    public static void main(String[] args) throws IOException{
        try {
            first();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void first() throws IOException{
        System.out.println("First Method are called...");
        try {
            second();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("First Method are rest Of Code...");
    }

    public static void second() throws IOException{// if not use Throws keywod then Compile Time Error Show
        System.out.println("second Method are called...");
        try {
            third();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("second Method are rest Of Code...");
    }

    public static void third() throws IOException{
        System.out.println("third Method are called...");
            fourth();
        System.out.println("third Method are rest Of Code...");
    }

    public static void fourth() throws IOException{
        System.out.println("fourth Method are called...");
        throw new IOException("Arithemetic Exception Occur....");
    }
}

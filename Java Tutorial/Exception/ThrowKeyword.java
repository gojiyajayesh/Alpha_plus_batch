import java.io.IOException;

public class ThrowKeyword {
    public static void main(String[] args) {
        // UnChecked Exception
        try{
        division(10);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        // Checked Exception
        try{
            division2(10);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            catch(IOException e){
                System.out.println(e);
            }
    }
    public static void division(int age){  // For Unchecked Exception
        if(age<18)
        throw new ArithmeticException("You are not eligible gor vote");
        else
        System.out.println("You are Eligible For vote...");
    }
    public static void division2(int age) throws IOException{
        if(age<18)
        throw new IOException("You are not eligible gor vote");
        else
        System.out.println("You are Eligible For vote...");
    }
}

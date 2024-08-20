import java.util.Scanner;

public class Positive_nagative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int no=sc.nextInt();
        if(no>=0)
        System.out.println("this is a positive Number");
        else
        System.out.println("this is a nagative Number");
        sc.close();
    }
}

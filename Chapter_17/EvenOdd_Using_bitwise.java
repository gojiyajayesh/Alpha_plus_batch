import java.util.Scanner;
public class EvenOdd_Using_bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:- ");
        int number =sc.nextInt();
        if((number&1)==0)   // It take less time because it work on direct in bit and % function use division by 2 so it is more efficiant
        {
            System.out.println("Number is Even Number");
        }
        else
        {
            System.out.println("Number is Odd Number");
        }
        sc.close();
    }
}

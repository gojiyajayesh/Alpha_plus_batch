import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :-");
        int first=sc.nextInt();
        System.out.println("Enter Second Number");
        int second=sc.nextInt();
        System.out.println("Which Opration are perfome you");
        char op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
            System.out.println(first+second);
            break;
            case '-':
            System.out.println(first-second);
            break;
            case '*':
            System.out.println(first*second);
            break;
            case '/':
            System.out.println(first/second);
            break;
            case '%':
            System.out.println(first%second);
            break;
            default:
            System.out.println("Please Enter Valid Opration");
        }
    }
}

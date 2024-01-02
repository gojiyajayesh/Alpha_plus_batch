import java.util.*;
public class Average_of_three_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        average(a,b,c);
    }
    public static void average(int a,int b,int c)
    {
        System.out.println("Average of three number is :- "+(a+b+c)/3);
    }
}

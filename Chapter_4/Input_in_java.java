import java.util.Scanner;
public class Input_in_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input from user to use following method
        int a=sc.nextInt();
        byte b=sc.nextByte();
        short c=sc.nextShort();
        long d=sc.nextLong();
        float e=sc.nextFloat();
        double f=sc.nextDouble();
        char g=sc.next().charAt(0);
        boolean h=sc.nextBoolean();
        System.out.println(a);     
        System.out.println(b);     
        System.out.println(c);     
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}

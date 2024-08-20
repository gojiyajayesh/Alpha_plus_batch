
/**
 * Average_of_three_number
 */
import java.util.Scanner;
public class Average_of_three_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        System.out.println((A+B+C)/3);
        sc.close();
    }
}
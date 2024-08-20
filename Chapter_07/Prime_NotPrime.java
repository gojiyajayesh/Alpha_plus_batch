import java.util.*;

public class Prime_NotPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int flag = 0;
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                System.out.println("This is not prime number");
                flag = 1;
                break;
            }

        }
        if (flag != 1 && no != 1)
            System.out.println("This is a prime number");
        sc.close();
    }
}
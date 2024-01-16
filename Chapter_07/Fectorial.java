import java.util.*;

public class Fectorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number you find");
        int number = sc.nextInt();
        int fec = 1;
        for (int i = 1; i <= number; i++) {
            fec *= i;
        }
        System.out.println(fec);
        sc.close();
    }
}

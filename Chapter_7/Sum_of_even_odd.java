import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of set");
        int set = sc.nextInt();
        int even_sum = 0, odd_sum = 0;
        for (int i = 1; i <= set; i++) {
            int temp = sc.nextInt();
            if (temp % 2 == 0)
                even_sum += temp;
            else
                odd_sum += temp;
        }
        System.out.println("Even Sum="+even_sum);
        System.out.println("Odd Sum="+odd_sum);
    }
}

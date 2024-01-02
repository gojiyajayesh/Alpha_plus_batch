public class Range_Of_Prime_Number {
    public static void main(String[] args) {
        int range = 30;
        for (int i = 1; i <= range; i++) {
            if (prime_Number(i))
                System.out.print(i + " ");
        }
    }

    public static boolean prime_Number(int n) {
        if(n==1)
        {
            return false;
        }
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

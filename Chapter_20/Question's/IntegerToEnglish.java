public class IntegerToEnglish {
    static String[] map = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static StringBuilder sb = new StringBuilder("");

    public static void main(String[] args) {
        intToEnglish(2018);
        System.out.println(sb);
    }

    public static void intToEnglish(int n) {
        if (n == 0)
            return;
        intToEnglish(n / 10);
        System.out.print(map[n % 10]+" ");
    }
}

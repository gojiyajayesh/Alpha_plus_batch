public class Number_pyramid {
    public static void main(String[] args) {
        print(6);
    }
    public static void print(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print(i);
                } 
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

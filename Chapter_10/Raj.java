public class Raj {
    public static void main(String[] args) {
        print(11);
    }

    public static void print(int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

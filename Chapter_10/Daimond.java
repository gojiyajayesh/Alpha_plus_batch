public class Daimond {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int row) {
        for (int i = 1; i <= row; i++) {
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
        for (int i = row; i >=1; i--) {
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

public class Inverted_rotated_half_pyramid {
    public static void main(String[] args) {
        print(5,6);
    }

    public static void print(int num_row,int num_col) {
        for (int i = 1; i <= num_row; i++) {
            for(int j=1;j<=num_col-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 * Butter_fly
 */
public class Butter_fly {

    public static void main(String[] args) {
        print(8);
    }
    public static void print(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <=(2*row-2*i);j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        // Method-1
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i+1; j++)
                System.out.print("*");
            for (int j = 1; j <=2*(i-1); j++)
                System.out.print(" ");
            for (int j = 1; j <=row-i+1; j++)
                System.out.print("*");
            System.out.println();
        }
        // Method-2
        /*

        for(int i=row;i>=1;i--)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <=(2*row-2*i);j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        
        */
    }
}
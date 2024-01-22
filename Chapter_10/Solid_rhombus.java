/**
 * Solid_rhombus
 */
public class Solid_rhombus {

    public static void main(String[] args) {
        print(5);
    }
    public static void print(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
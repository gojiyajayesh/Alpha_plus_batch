/**
 * Hollow_rhombus
 */
public class Hollow_rhombus {
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
                if(i==1||j==1||j==row|i==row)
                {
                    System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
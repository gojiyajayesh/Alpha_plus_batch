/**
 * Diamond_Pattern
 */
public class Diamond_Pattern {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=(row-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
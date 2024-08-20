/**
 * Floyds_triangle
 */
public class Floyds_triangle {
    public static void main(String[] args) {
        print(5, 5);
    }

    public static void print(int num_row,int num_col)
    {
        int cnt=1;
        for(int i=1;i<=num_row;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(cnt+++"\t");
            }
            System.out.println();
        }
    }

}
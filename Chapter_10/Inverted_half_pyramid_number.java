/**
 * Inverted_half_pyramid_number
 */
public class Inverted_half_pyramid_number {

    public static void main(String[] args) {
        print(5,5);
    }
    public static void print(int num_row,int num_col)
    {
        for(int i=1;i<=num_row;i++)
        {
            for(int j=1;j<=num_col-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/**
 * Triangle_0_1
 */
public class Triangle_0_1{
    public static void main(String[] args) {
        print(5,5);
        print_2(5,5);
    }
    public static void print(int num_row,int num_col){
        for(int i=1;i<=num_row;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2==0)
                    System.out.print("1");
                    else
                    System.out.print("0");
                }
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2==1)
                    System.out.print("1");
                    else
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void print_2(int num_row,int num_col)
    {
        for(int i=1;i<=num_row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
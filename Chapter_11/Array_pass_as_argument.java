/**
 * Array_pass_as_argument
 */
public class Array_pass_as_argument {

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,0};
        Update(num);
        for(int i:num)
        {
            System.out.println(i);
        }
    }
    public static void Update(int num[])
    {
        for(int i=0;i<=2;i++)
        {
            num[i]+=1;
        }

    }
}
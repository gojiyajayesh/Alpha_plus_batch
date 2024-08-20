public class DecOrderPrint {
    public static void main(String[] args) {
        print(100);
    }
    public static void print(int n)
    {
        if(n==1)
        {
        System.out.print(n+" ");
        return ;
        }
        System.out.print(n+" ");
        print(n-1);
        return;
    }
}
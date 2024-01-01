public class Decimal_to_binary {
    public static void main(String[] args) {
        System.out.println(D_to_B(7));
    }

    public static int D_to_B(int n) {
        int binary=0,cnt=0;
        while(n>0)
        {
            int last=n%2;
            binary+=(last*Math.pow(10,cnt++));
            n/=2;
        }
        return binary;
    }
}

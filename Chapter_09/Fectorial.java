public class Fectorial {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fec(a));
    }

    public static int fec(int a) {
        int fec=1;
        for(int i=1;i<=a;i++)
        {
            fec*=i;
        }
        return fec;
    }
}

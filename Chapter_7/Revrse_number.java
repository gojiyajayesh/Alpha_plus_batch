public class Revrse_number {
    public static void main(String[] args) {
        int number=1234,sum=0;
        while(number>0)
        {
            int last=number%10;
            sum=sum*10+last;
            number/=10;
        }
        System.out.println(sum);
    }
}

/**
 * CountSetbits
 */
public class CountSetbits {
    public static int countsetbit(int n)
    {
        int cnt=0;
        while(n!=0)   // Not work for nagative number 
        {
            if((n&1)==1)
            cnt++;
            n=n>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(countsetbit(15));
    }
}
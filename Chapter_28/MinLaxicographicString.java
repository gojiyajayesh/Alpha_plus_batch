import java.util.Arrays;
public class MinLaxicographicString {
    public static void main(String[] args) {
        System.out.println(minLaxico(25,3));
    }

    public static char[] minLaxico(int k,int n){
        char[] result=new char[n];
        Arrays.fill(result,'a');


        for(int i=n-1;i>=0;i--){
            k-=i;
            if(k>=0){
                if(k>=26){
                    result[i]='z';
                    k-=26;
                }
                else
                {
                    result[i]=(char)(97+k-1);
                    k=0;
                }
            }
            else
            break;
            k+=i;
        }

        return result;
    }
}

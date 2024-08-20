public class MaximumBalanced {
    public static void main(String[] args) {
        System.out.println(partition("LRRRRLLRLLRL"));
    }
    public static int partition(String str){
        int n=str.length();
        if(n==0){
            return 0;
        }
        int l=0,r=0,ans=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='R'){
                r++;
            }
            else{
                l++;
            }

            if(l==r){
                ans++;
            }
        }
        return ans;
    }
}

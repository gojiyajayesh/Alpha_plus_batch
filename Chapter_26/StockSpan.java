import java.util.Stack;

public class StockSpan{
    public static void main(String[] args) {
        int[] stock={100,80,60,70,60,85,100};
        int[] span=stockSpan(stock);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
    public static int[] stockSpan(int[] stock){
        Stack<Integer> st=new Stack<>();
        int[] span=new int[stock.length];
        span[0]=1;
        st.push(0);

        for(int i=1;i<stock.length;i++){
            int currentPrice=stock[i];
            while(!st.empty()&&currentPrice>=stock[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
                st.push(i);
            }
        }
        return span;
    }
    public static int[] stockSpan2(int[] stock){
        int[] span=new int[stock.length];
        span[0]=1;
        for(int i=1;i<stock.length;i++){
            int j=i-1;
            int prevHign=i;
            while(j>=0){
                if(stock[i]<stock[j]){
                prevHign=j;
                break;
                }
                j--;
            }
            span[i]=(prevHign==i)?i+1:i-prevHign;
        }
        return span;
    }
}
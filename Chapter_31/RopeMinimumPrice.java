import java.util.PriorityQueue;

public class RopeMinimumPrice {
    public static void main(String[] args) {
        System.out.println(minPrice(new int[]{2,3,3,4,6}));
    }
    public static int minPrice(int[] price){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<price.length;i++){
            minHeap.offer(price[i]);
        }
        int sum=0;
        while(minHeap.size()>1){
            int first =minHeap.remove();
            int second=minHeap.remove();
            sum+=(first+second);
            minHeap.offer((first+second));
        }
        return sum;
    }
}

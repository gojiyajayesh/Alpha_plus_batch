import java.util.PriorityQueue;
public class MinCostOfRope {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(minRope(arr, 3));
    }
    public static int minRope(int arr[],int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int res=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            res+=first+second;
            pq.add(first+second);
        }
        return res;
    }
}

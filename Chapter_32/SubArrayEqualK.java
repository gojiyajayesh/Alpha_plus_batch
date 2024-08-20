import java.util.HashMap;

public class SubArrayEqualK {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(subArrayCount(arr, 3));
    }
    public static int subArrayCount(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int result=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                result+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}

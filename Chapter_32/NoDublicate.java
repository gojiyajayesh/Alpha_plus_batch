import java.util.HashSet;
import java.util.Iterator;

public class NoDublicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,2,1};
        setCall(arr);
    }
    public static void setCall(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
        Iterator<Integer> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(set.contains(5));
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}

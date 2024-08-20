import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxChainPair {
    public static void main(String[] args) {
            List<Pair> list=new ArrayList<>();
            list.add(new Pair(5,24));
            list.add(new Pair(39,60));
            list.add(new Pair(5,28));
            list.add(new Pair(27,40));
            list.add(new Pair(50,90));
            System.out.println(maxChain(list));
            System.out.println(list);
    }

    public static int maxChain(List<Pair> list){
        // Using lamda function
        //Collections.sort(list,(a,b)->Integer.compare(a.second, b.second));


        // Using normal function
        // Collections.sort(list,new Comparator<Pair>(){
        //     @Override
        //     public int compare(Pair a,Pair b){
        //         return Integer.compare(a.second, b.second);
        //     }
        // });


        // Using Comparable Interface
        //Collections.sort(list);

        //Collections.sort(list,Comparator.comparingInt(o->o.second));

        Collections.sort(list,new SecondNumberSorting());
        int max=1,last=list.get(0).second;

        for(int i=1;i<list.size();i++){
            if(list.get(i).first>=last){
            max++;
            last=list.get(i).second;
            }
        }
        return max;
    }
}

class SecondNumberSorting implements Comparator<Pair>{
    @Override
    public int compare(Pair a,Pair b){
        return Integer.compare(a.second,b.second);
    }
}

class Pair implements Comparable<Pair>{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "\nPair [first=" + first + ", second=" + second + "]";
    }

    @Override
    public int compareTo(Pair s){
        return Integer.compare(this.second, s.second);
    }
}

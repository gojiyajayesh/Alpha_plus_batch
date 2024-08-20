import java.util.ArrayList;

import java.util.*;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(56);

        list.add(19);
        list.add(1, 2);
        list.addAll(new ArrayList<>(list));
        System.out.println(list);
        list.ensureCapacity(20);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        list.add(20);
        list.add(90);
        list.add(89);

        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Object[] arr=list.toArray();

        for(Object x:arr){
            System.out.println(x);
        }
        Collections.sort(list);
        System.out.println(list);
        list.trimToSize();
        list.add(90);
        System.out.println(list);
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorWay {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Jayesh");
        list.add("gojiya");
        list.add("ahir");
        list.add("how are you");


        // Using Iterator
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Using List Iterator reverse Order Print
        ListIterator<String> listIterator=list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Using Loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // ForEach loop

        list.forEach(a->{
            System.out.println(a);
        });
    }
}

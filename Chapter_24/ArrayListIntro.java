import java.util.ArrayList;
class ArrayListIntro{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);    // add function use for add obj on last in Array List 
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(0);
        System.out.println(list);

        System.out.println(list.get(2));   // get()   function use for get element in index to return obj

        list.remove(4);    // remove element in index 4 to 
        
    }
}
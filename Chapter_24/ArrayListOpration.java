import java.util.*;
class ArrayListOpration{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);   // Time Complexity is O(1)
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);  // Print List Object
        

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");   // get()   return Element in index i   Time Complexity:- O(1)
        }

        System.out.println();
        System.out.println(list);

        list.remove(3);   // delete Element and rearrange Array Internaly

        System.out.println(list);

        list.set(2,123123);   // Set Element Of In Index first parameter is index and second is Value

        System.out.println(list);

        System.out.println(list.contains(3));    // Element are present On List then return true other wise return false it return boolean value
        

        int size=list.size();
        System.out.println(size);
    }
}
import java.util.*;
public class PairSum2{
    public static void main(String []args)
    {
        ArrayList<Integer> list=new ArrayList<>();
            list.add(10);
            list.add(11);
            list.add(12);
            list.add(13);
            list.add(3);
            list.add(5);
            list.add(7);
            list.add(8);
            list.add(9);

            System.out.println(pairSum2(list,12));
    }
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int pivote=0;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1)){
                pivote=i;
                break;
            }
        }
        int j=pivote;
        int i=(pivote+1);

            while(i!=j)
            {
                if(target==list.get(i)+list.get(j))
                {
                    return true;
                }
                else if (target<list.get(i)+list.get(j))
                {
                    j=(list.size()+j-1)%list.size();
                }
                else
                    i=(i+1)%list.size();
            }
            return false;
    }
}
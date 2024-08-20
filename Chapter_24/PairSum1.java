import java.util.*;
public class PairSum1{
    public static void main(String []args)
    {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(9);
            list.add(8);
            list.add(7);
            list.add(3);
            list.add(7);

            System.out.println(pairSum(list,345));
            System.out.println(pairSum1(list,345));
    }

    // Brute Force Code
    public static boolean pairSum(ArrayList<Integer> list,int target)
    {
            for(int i=0;i<list.size();i++)
            {
                for(int j=i+1;j<list.size();j++)
                {
                    if(target==list.get(i)+list.get(j))
                    {
                        return true;
                    }
                }
            }
            return false;
    }
     public static boolean pairSum1(ArrayList<Integer> list,int target)
    {
            int i=0;
            int j=list.size()-1;

            while(i<j)
            {
                if(target==list.get(i)+list.get(j))
                {
                    return true;
                }
                else if (target<list.get(i)+list.get(j))
                {
                    j--;
                }
                else
                    i++;
            }
            return false;
    }
}
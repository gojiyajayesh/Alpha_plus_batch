import java.util.HashSet;

/**
 * Question_1
 */
public class Question_1 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,1,1,4};
        System.out.println(twice(arr));
        System.out.println(twiseH(arr));
    }

    public static boolean twiseH(int Arr[])  // Time Complexity is O(n)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<Arr.length;i++)
        {
            if(set.contains(Arr[i]))
            return true;
            else
            set.add(Arr[i]);
        }
        return false;
    }
    public static boolean twice(int arr[])  // Time Complexity is O(n^2)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) return true;
            }
        }
        return false;
    }
}
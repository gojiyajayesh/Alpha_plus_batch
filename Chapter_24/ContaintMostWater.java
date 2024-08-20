import java.util.ArrayList;
public class ContaintMostWater{
    
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(mostWaterBruteForce(list));
        System.out.println(mostWaterOptimize(list));
    }

    public static int mostWaterOptimize(ArrayList<Integer> height)
    {
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp)
        {
            int heightCol=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currentWater=heightCol*width;
            maxWater=Math.max(currentWater,maxWater);
            if(height.get(lp)<height.get(rp))
            lp++;
            else
            rp--;
        }
        return maxWater;
    }

    // Time Complexity is O(n^2)
    public static int mostWaterBruteForce(ArrayList<Integer> height)
    {
        int maxWater=0;

        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int line1=height.get(i);
                int line2=height.get(j);
                int heightCol=Math.min(line1,line2);
                int width=j-i;
                int currentWater=heightCol*width;
                maxWater=Math.max(currentWater,maxWater);
            }
        }
        return maxWater;
    }
}
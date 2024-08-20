import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelectionUnsort {
    public static void main(String[] args) {
        int[] start = {0, 3, 1, 5, 8, 5};
        int[] end = {6, 4, 2, 7, 9, 9};

        System.out.println(activitySelection(start, end));
    }
    public static int activitySelection(int[] start,int[] end){
        int[][] activity=new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }

        Arrays.sort(activity,Comparator.comparingInt(o->o[2]));

        ArrayList<String> list=new ArrayList<>();
        int max=1;
        int last=activity[0][2];
        list.add("A"+activity[0][0]);
        for(int i=1;i<start.length;i++){
            if(activity[i][1]>=last){
                max+=1;
                last=activity[i][2];
                list.add("A"+activity[i][0]); 
            }
        }
        for(String i:list){
            System.out.println(i+" ");
        }
        return max;
    }
}

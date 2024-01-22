/**
 * Sort_Inbuilt
 */
import java.util.Arrays;
import java.util.Collections;
public class Sort_Inbuilt {

    public static void main(String[] args) {
        Integer arr[] = { 1,2,3,4,5,6,98,8,9,12,13,14,15,56,57};
        System.out.println("Before Sorting");
        for (Integer i : arr)
            System.out.print(i + " ");
            //Arrays.sort(arr);
            // Arrays.sort(arr,0,4);
            // Arrays.sort(arr,Collections.reverseOrder());
            Arrays.sort(arr,0,7,Collections.reverseOrder());
        System.out.println("\nAfter Sorting");
        for (Integer i : arr)
            System.out.print(i + " ");
    }
}
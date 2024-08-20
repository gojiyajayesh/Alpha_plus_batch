/**
 * Counting_Sort
 */
public class Counting_Sort {
    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int helper[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            helper[arr[i]]++;
        }
        int cnt =0;
        // this is for descending order
        // for(int i=max;i>=0;i--)
        // {
        //     while(helper[i]>0)
        //     {
        //         arr[cnt++]=i;
        //         helper[i]--;
        //     }
        // }
         // this is ascending order
        for (int i = 1; i <= max; i++) {
            int j = helper[i];
            for (int k = 0; k < j; k++) {
                arr[cnt++] = i;
            }
        }
        


    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9 };
        System.out.println("Before Sorting");
        for (int i : arr)
            System.out.print(i + " ");
        countingSort(arr);
        System.out.println("\nAfter Sorting");
        for (int i : arr)
            System.out.print(i + " ");

    }
}
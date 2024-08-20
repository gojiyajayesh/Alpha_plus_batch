public class SerchInRotetedArray {
    public static void main(String[] args) {
        int arr[]={6,7,8,1,2,3,4,5};
        System.out.println(search(arr, 2, 0, arr.length-1));
    }

    public static int search(int arr[], int target, int si, int ei) {
        //base Case
        if(si>ei)
        return -1;
        // mid
        int mid = si + (ei - si) / 2;
        if (target == arr[mid])
            return mid;

        // Line-1
        if (arr[si] <= arr[mid]) {
            // Case-a Left Side Line-1
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } 
            // Case-b Right Side Line-1
            else {
                return search(arr, target, mid + 1, ei);
            }
        } 
        // Line-2 
        else {
            // Case-c Right Side Line-2
            if (arr[mid]<=target&&target<=arr[ei]) {
                return search(arr, target,mid + 1,ei);
            } 
            // Case-d Left Side in Line-2
            else {
                return search(arr, target,si,mid - 1);
            }
        }
    }
}

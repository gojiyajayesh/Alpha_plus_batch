import java.util.Arrays;
public class MinAbsoluteDiff {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int result = minDiff(a, b);
        System.out.println("Minimum Absolute Difference: " + result);
    }
    public static int minDiff(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int main=0;
        for(int i=0;i<a.length;i++){
            main+=Math.abs(a[i]-b[i]);
        }
        return main;
    }
}

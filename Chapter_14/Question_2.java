/**
 * Question_2
 */
public class Question_2 {
    public static int sum(int matrix[][],int row)
    {
        int sum=0;
        for(int i=0;i<matrix[row].length;i++)
        {
            sum+=matrix[row][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(sum(nums, 1));
    }
}
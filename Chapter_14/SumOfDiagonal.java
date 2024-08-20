/**
 * SumOfDiagonal
 */
public class SumOfDiagonal {
    public static int sumDiagonal(int matrix[][]) {
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<n;i++)  // Time Complexity is O(n^2) 
        {
            // Sum of Primary Diagonal
            sum+=matrix[i][i];
            // Sum of Secondry Diagonal
            if(i!=n-i-1)
            sum+=matrix[i][n-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int metrix[][] = new int[4][4];
        int cnt = 1;
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                metrix[i][j] = cnt++;
            }
        }
      int x=  sumDiagonal(metrix);
      System.out.println(x);
    }
}
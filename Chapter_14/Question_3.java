/**
 * Question_3
 */
public class Question_3 {
    public static int[][] transportMatrix(int matrix[][]){
        int Tmatrix[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                Tmatrix[j][i]=matrix[i][j];
            }
        }
        return Tmatrix;
    }
    public static void print(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6}};
        System.out.println("Normal Matrix");
        print(matrix);
        int Tmatrix[][]=transportMatrix(matrix);
        System.out.println("Transport Matrix");
        print(Tmatrix);
    }
}
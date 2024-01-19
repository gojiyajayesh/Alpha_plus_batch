/**
 * Question_1
 */
public class Question_1 {
    public static int question1(int matrix[][], int key) {
        int no = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j])
                    no++;
            }
        }
        return no;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        System.out.println(question1(matrix, 7));
    }
}
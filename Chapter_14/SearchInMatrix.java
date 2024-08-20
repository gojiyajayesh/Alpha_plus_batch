/**
 * SearchInMatrix
 */
public class SearchInMatrix {

    // start Staircase in Matrix Search
    public static boolean search(int matrix[][], int key) // time Complexity is O(n)
    {
        int i = 0, j = matrix.length - 1, n = matrix.length;
        while (i < n && j > 0) {
            if (key == matrix[i][j]) {
                System.out.println("Present in Location in [ " + i + "," + j + " ]");
                return true;
            } else if (key < matrix[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
    // End Staircase in Matrix Search

    // Start Linear Search in matrix
    public static boolean linearSearch(int matrix[][], int key) // Time Complexity is O(n^2)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Present in Location in [ " + i + "," + j + " ]");
                    return true;
                }
            }
        }
        return false;
    }
    // End Matrix Search using Linear Search

    // Start Binary Search In Meatrix
    public static boolean binarySearch(int matrix[][], int key) { // Time Complexity is O(nlogn)
        for (int i = 0; i < matrix.length; i++) {
            int flag = bSearch(matrix, key, i);
            if (flag != -1) {
                System.out.println("Present in Location in [ " + i + "," + flag + " ]");
                return true;
            }
        }
        return false;
    }

    public static int bSearch(int matrix[][], int key, int row) {
        int str = 0, end = matrix[row].length - 1;
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (key == matrix[row][mid])
                return mid;
            else if (key > matrix[row][mid])
                str = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    // End Of Binary Search in matrix

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40, },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.println(binarySearch(matrix, 33));
        System.out.println(search(matrix, 33));
        System.out.println(linearSearch(matrix, 33));

    }
}
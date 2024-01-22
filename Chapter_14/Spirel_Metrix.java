/**
 * Spirel_Metrix
 */
public class Spirel_Metrix {
    public static void spirelMetrix(int metrix[][]) {
        int n = metrix.length;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = metrix[0].length - 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            // Top
            printT(metrix, colStart, colEnd, rowStart);
            // Right
            printE(metrix, rowStart + 1, rowEnd, colEnd);
            // Bottom
            printB(metrix, colEnd - 1, colStart, rowEnd);
            // Left
            printS(metrix, rowEnd - 1, rowStart + 1, colStart);
            // Update Row And Col Reffrence
            colStart++;
            colEnd--;
            rowStart++;
            rowEnd--;
        }
    }

    public static void printT(int metrix[][], int start, int end, int i) {
        for (int j = start; j <= end; j++) {
            System.out.print(metrix[i][j] + " ");
        }
    }

    public static void printE(int metrix[][], int start, int end, int j) {
        for (int i = start; i <= end; i++) {
            System.out.print(metrix[i][j] + " ");
        }
    }

    public static void printB(int metrix[][], int start, int end, int i) {
        for (int j = start; j >= end; j--) {
            System.out.print(metrix[i][j] + " ");
        }
    }

    public static void printS(int metrix[][], int start, int end, int j) {
        for (int i = start; i >= end; i--) {
            System.out.print(metrix[i][j] + " ");
        }
    }

    public static void main(String[] args) {
        int metrix[][] = new int[5][5];
        int cnt = 1;
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                metrix[i][j] = cnt++;
            }
        }
        spirelMetrix(metrix);
    }
}
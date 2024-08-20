import java.util.ArrayList;
import java.util.List;

/**
 * Spirel_Metrix
 */
public class Spirel_Metrix {
    public static List<Integer> spirelMetrix(int matrix[][]) {
        List<Integer> list = new ArrayList<>();
        int cs = 0, ce = matrix[0].length - 1, rs = 0, re = matrix.length - 1;
        // outer loop
        while (cs <= ce && rs <= re) {
            // Top
            for (int a = cs; a <= ce; a++) {
                list.add(matrix[rs][a]);
            }
            // Right
            for (int a = rs + 1; a <= re; a++) {
                list.add(matrix[a][ce]);
            }
            // Bottom
            for (int a = ce - 1; a >= cs; a--) {
                if (rs == re)
                    break;
                list.add(matrix[re][a]);
            }
            // Left
            for (int a = re - 1; a > cs; a--) {
                if (cs == ce)
                    break;
                list.add(matrix[a][cs]);
            }
            cs++;
            ce--;
            rs++;
            re--;
        }
        return list;
    }

    public static void main(String[] args) {
        int metrix[][] = new int[5][5];
        int cnt = 1;
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                metrix[i][j] = cnt++;
            }
        }
       System.out.println(spirelMetrix(metrix));
    }
}
/**
 * Two_D_Array
 */
public class Two_D_Array {

    public static void main(String[] args) {
        int metrix[][] = new int[3][3];
        int cnt = 1;
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                metrix[i][j] = cnt++;
            }
        }
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
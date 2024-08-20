import java.util.HashMap;

public class TilingProblem {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(way(40));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken: " + elapsedTime + " milliseconds");
        long startTime2 = System.currentTimeMillis();
        System.out.println(way2(40));
        long endTime2 = System.currentTimeMillis();
        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Time taken: " + elapsedTime2 + " milliseconds");
    }
    public static int way(int n) {
        if (n == 0 || n == 1)
            return 1;
        int vertical = way(n - 1);
        int horizontal = way(n - 2);
        return vertical + horizontal;
    }

    public static int way2(int n) {
        if (n == 0 || n == 1)
            return 1;
        if (map.containsKey(n))
            return map.get(n);
        int vertical = way2(n - 1);
        int horizontal = way2(n - 2);
        int result = vertical + horizontal;
        map.put(n, result);
        return result;
    }

}
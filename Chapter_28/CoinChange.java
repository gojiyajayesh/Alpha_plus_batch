import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(changeCoin(12907));
    }

    public static int changeCoin(int price) {
        Integer denominations[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

        Arrays.sort(denominations, Collections.reverseOrder());
        HashMap<Integer, Integer> coinSet = new HashMap<>();
        int noCoin = 0;

        for (int denomination : denominations) {
            while (price >= denomination) {
                price -= denomination;
                noCoin++;
                coinSet.put(denomination, coinSet.getOrDefault(denomination, 0) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(coinSet.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " denomination coins: " + entry.getValue());
        }

        return noCoin;
    }
}

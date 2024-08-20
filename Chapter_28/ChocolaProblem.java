import java.util.Collections;
import java.util.Arrays;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer first[] = {2, 1, 3, 1, 4};
        Integer second[] = {4, 1, 2};
        Arrays.sort(first, Collections.reverseOrder());
        Arrays.sort(second, Collections.reverseOrder());

        System.out.println(chocolaProblem(first, second));
    }

    public static int chocolaProblem(Integer horizontal[], Integer vertical[]) {
        int hp = 1, vp = 1; // initial parts count for horizontal and vertical
        int hr = 0, vr = 0; // initial position for horizontal and vertical
        int cost = 0;

        while (hr < horizontal.length && vr < vertical.length) {
            if (horizontal[hr] > vertical[vr]) {
                cost += horizontal[hr] * vp;
                hr++;
                hp++;
            } else {
                cost += vertical[vr] * hp;
                vr++;
                vp++;
            }
        }

        // Handle remaining horizontal cuts
        while (hr < horizontal.length) {
            cost += horizontal[hr] * vp;
            hr++;
        }

        // Handle remaining vertical cuts
        while (vr < vertical.length) {
            cost += vertical[vr] * hp;
            vr++;
        }

        return cost;
    }
}

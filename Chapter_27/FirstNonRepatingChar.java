import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepatingChar {
    public static void main(String[] args) {
        System.out.println(nonRepeating("aabccxb"));
    }

    public static String nonRepeating(String str) {
        Queue<Character> queue = new LinkedList<>();
        int freq[] = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
            queue.add(str.charAt(i));
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }
            if (queue.isEmpty())
                sb.append(-1 + " ");
            else
                sb.append(queue.peek() + " ");
        }
        return sb.toString();
    }
}

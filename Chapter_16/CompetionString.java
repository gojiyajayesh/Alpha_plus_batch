/**
 * CompetionString
 */
public class CompetionString {
    public static String compretion(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int cnt = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
                i++;
            }
            sb.append(str.charAt(i));
            if (cnt > 1)
                sb.append(cnt);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(compretion(str));
    }
}
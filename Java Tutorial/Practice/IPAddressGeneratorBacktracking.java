import java.util.ArrayList;
import java.util.List;

public class IPAddressGeneratorBacktracking {
    
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private static void backtrack(List<String> result, List<String> current, String s, int start) {
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i <= s.length()) {
                String segment = s.substring(start, start + i);
                if (isValid(segment)) {
                    current.add(segment);
                    backtrack(result, current, s, start + i);
                    current.remove(current.size() - 1);  // Backtrack
                }
            }
        }
    }

    private static boolean isValid(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) return false;
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String s1 = "25525511135";
        String s2 = "0000";
        String s3 = "101023";

        System.out.println("Valid IPs for " + s1 + " : " + restoreIpAddresses(s1));
        System.out.println("Valid IPs for " + s2 + " : " + restoreIpAddresses(s2));
        System.out.println("Valid IPs for " + s3 + " : " + restoreIpAddresses(s3));
    }
}

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("JAYESH", "HSEYAJ"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(!countMap.containsKey(ch)){
                return false;
            }
            else
            {
                if(countMap.get(ch)==1){
                    countMap.remove(ch);
                }
            }
        }
        return countMap.isEmpty();
    }
}

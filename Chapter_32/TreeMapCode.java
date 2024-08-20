import java.util.Map;
import java.util.TreeMap;

public class TreeMapCode {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Jayesh", 101);
        map.put("nirbahy", 102);
        map.put("gohiya", 103);
        map.put("", 104);
        map.put("ahir", 105);
        map.put("xyz", 106);
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

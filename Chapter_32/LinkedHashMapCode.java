import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("jayesh", 101);
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
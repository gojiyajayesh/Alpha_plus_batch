import java.util.HashMap;
import java.util.Set;

public class HashMapJCF {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Put opration in O(1) Time Complexity
        map.put("India", 142);
        map.put("Pakistan-Bhikhari", 30);
        map.put("Chaina-Chodu", 150);
        System.out.println(map);

        // get Opration O(1) Time
        System.out.println(map.get("India"));

        // Search Opration O(1)
        System.out.println(map.containsKey("India"));

        // remove
        System.out.println(map.remove("India"));

        // Size
        System.out.println(map.size());

        // Is Empty
        System.out.println(map.isEmpty());

        // Clear
        // map.clear();

        Set<String> set=map.keySet();
        System.out.println(set);

        for(String s:set){
            System.out.println(s+" "+ map.get(s));
        }
    }
}

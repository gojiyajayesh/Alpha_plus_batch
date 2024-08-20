import java.util.HashMap;

public class ItineraryTikit {
    public static void main(String[] args) {
        String[][] tikit = { { "Chennai", "Bengaluru" }, { "Mumbai", "Delhi" }, { "Goa", "Chennai" },
                { "Delhi", "Goa" } };
        print(tikit);
    }

    public static void print(String[][] tikit) {
        HashMap<String, String> from = new HashMap<>();
        HashMap<String, String> to = new HashMap<>();

        for (int i = 0; i < tikit.length; i++) {
            from.put(tikit[i][0], tikit[i][1]);
            to.put(tikit[i][1], tikit[i][0]);
        }

        String StartingPoint=new String();
        for(String key:from.keySet()){
            if(!to.containsKey(key)){
                StartingPoint=key;
                break;
            }
        }
        String key=StartingPoint;
        System.out.print(key);
        while(from.get(key)!=null){
            key=from.get(key);
            System.out.print("->"+key);
        }
    }
}

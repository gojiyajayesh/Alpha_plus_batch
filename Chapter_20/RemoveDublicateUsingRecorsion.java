public class RemoveDublicateUsingRecorsion {
    static boolean map[] = new boolean[26];
    static StringBuilder sb = new StringBuilder("");

    public static void main(String[] args) {
        removeDublicate("appnacollege", 0);
    }

    public static void removeDublicate(String str, int index) {
        if (index == str.length()) {
            System.out.println(sb);
            return;
        }
        if (map[str.charAt(index) - 'a']) {
            removeDublicate(str, ++index);
        } else {
            sb.append(str.charAt(index));
            map[str.charAt(index) - 'a']=true;
            removeDublicate(str, ++index);
        }
    }
}

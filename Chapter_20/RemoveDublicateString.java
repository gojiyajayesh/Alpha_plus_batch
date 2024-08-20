/**
 * RemoveDublicateString
 */
public class RemoveDublicateString {
    public static void main(String[] args) {
        System.out.println(remove("appnnacollege"));
    }
    
    public static String remove(String str) {
        boolean[] helper=new boolean[26];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(!helper[str.charAt(i)-'a']){
                sb.append(str.charAt(i));
                helper[str.charAt(i)-'a']=true;
            }
        }
        return sb.toString();
    }
}
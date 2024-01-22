/**
 * StringCompare
 */
public class StringCompare {

    public static void main(String[] args) {
        String s1="jayesh";
        String s2="jayesh";
        String s3=new String("jayesh");
        if(s1==s2)
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
        if(s1==s3)
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
        if(s1.equals(s3))
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
}
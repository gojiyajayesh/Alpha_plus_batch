public class intern {
    public static void main(String[] args) {
        String s1=new String("jayesh");
        String s2=s1.intern();
        System.out.println(s1==s2);
        String s3="jayesh";
        String s4=s3.intern();
        System.out.println(s3==s4);
    }
}

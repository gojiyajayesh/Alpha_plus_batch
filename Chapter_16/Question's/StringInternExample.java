public class StringInternExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        
        System.out.println(s1 == s2); // false, because s2 is created using 'new', so it is not interned

        s2 = s2.intern(); // Interning s2

        System.out.println(s1 == s2); // true, because now both s1 and s2 refer to the same instance in the string pool
    }
}

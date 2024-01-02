public class Block_scope{
    public static void main(String[] args) {
        int s=10;
        {
            int p=20;
            System.out.println(p);
            System.out.println(s);
        }
        System.out.println(s);
      //  System.out.println(p);   // Error because p is visible only in block of scope
    }
}

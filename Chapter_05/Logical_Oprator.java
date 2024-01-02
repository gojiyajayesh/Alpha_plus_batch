public class Logical_Oprator {
    public static void main(String[] args) {
        /*
         * Logical Oprator 
         * 1. OR    ||
         * 2. AND   &&
         * 3. NOT    !
         */
        int a = 10, b = 12, c = 10;
        if (!(a != c))
            System.out.println("NOT");
        if (a == b||a<b)
            System.out.println("OR");
        if (a <= c&&a >= c)
            System.out.println("AND");
       
    }
}

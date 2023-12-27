public class Arithmetic_oprator {
    public static void main(String[] args) {
        /*
         * Arithmetic oprator 
         * Binary Oprator :- 1. Addition +
         *                   2. Subtraaction -
         *                   3. Multiplication *
         *                   4. Division /
         *                   5. Modulo(Remander) %
         * Unary Oprator :-  1. Increment Oprator
         *                      --> Pre Increment 
         *                          ++a means first value cahnge after use 
         *                      --> Post Increment 
         *                          a++ means First value is use after it change
         *                   2. Decrement Oprator
         *                      --> Pre Decrement
         *                          --a means First value is change after it use
         *                      --> Post Decrement
         *                          a-- means first value is use after it change
         * 
         */
        int a=10,b;
        b=++a;
        int c=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d=a--;
        System.out.println(d);
    }
}

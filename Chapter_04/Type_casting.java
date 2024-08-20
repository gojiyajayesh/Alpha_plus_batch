public class Type_casting {
    public static void main(String[] args) {
        /*
         * Narrowing Conversion {Explicit}
         * big to small
         * like float to int
         * int to byte
         */
        float a = 23.45f;
        int b = (int) a;
        System.out.println(b);
        char c = 'j';
        int d = c;
        System.out.println(d);
        char e = (char) d;
        System.out.println(e);
    }
}

public class Type_conversion {
    public static void main(String[] args) {
        /*
         * implicite {Wide Conversion}
         * String :- byte<short<int<float<long<double
         * if below condition are Satisfied then type conversion is work
         * 1. type compatable
         * 2. destination type > Source type
         */
        int a = 10;
        long b = a; // this is work properly
        // int c=b; this not work properly because above property are not satisfied
        System.out.println(b + a);
    }
}

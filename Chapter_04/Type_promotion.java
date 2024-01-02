public class Type_promotion {
    public static void main(String[] args) {
        byte a=10;
        short b=123;
        char c='i';
        int d=a+b+c;
        System.out.println(d);
        /*
         * it convert byte short and char to int 
         * and biggest variable size is consider and it assigde 
         */
    }

}
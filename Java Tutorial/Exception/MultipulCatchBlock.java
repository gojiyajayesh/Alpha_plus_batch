public class MultipulCatchBlock {
    public static void main(String[] args) {
        try {
            int a=30/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        /*catch(ArithmeticException e){    it show Compiler error Parent Not write Up
            System.out.println(e);
        }*/
    }
}

public class InnerClassDataMember {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.print();
        Outer.Inner Inner=new Outer.Inner();
        Inner.print();
    }
}
class Outer{
    static int outerData=20;
    static class Inner{
        int innerData=30;
        public void print(){
            System.out.println("This is a Inner Class Method"+outerData);
        }
    }
    public void print(){
        System.out.println("Outer Print Method...");
    }
}

public class InnerClass {
    int data=10;
    class Inner{
        int inData=20;
        void method(){
            System.out.println("Inner Class Method");
        }
    }
    public static void main(String[] args) {
        InnerClass in=new InnerClass();
        InnerClass.Inner i=in.new Inner();
        i.method();
    }
}

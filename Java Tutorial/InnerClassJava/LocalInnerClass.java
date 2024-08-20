public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass obj=new OuterClass();
        obj.method();
    }
}

class OuterClass {
    void method() {
        int a=1000;
        class InnerClass extends OuterClass{ 
            // If Not Extends then print normal but extends then it run infinite time because new obj are created and call in deep to deep
            void print(){
                System.out.println("Inner Class Print Method"+a);
            }
        }

        InnerClass obj=new InnerClass();
        obj.print();
        obj.method();
    }
}
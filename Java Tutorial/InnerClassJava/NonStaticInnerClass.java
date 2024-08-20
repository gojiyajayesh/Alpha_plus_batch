public class NonStaticInnerClass {
    public static void main(String[] args) {
        OuterClass obj=new OuterClass();
        OuterClass.InnerClass innerClass=obj.new InnerClass(10);
        innerClass.print();
        OuterClass obj2=new OuterClass();
        OuterClass.InnerClass innerClass2=obj2.new InnerClass(20);
        innerClass2.print();
        OuterClass obj3=new OuterClass();
        OuterClass.InnerClass innerClass3=obj3.new InnerClass(30);
        innerClass3.print();
        OuterClass obj4=new OuterClass();
        OuterClass.InnerClass innerClass4=obj4.new InnerClass(40);
        innerClass4.print();
    }    
}
class OuterClass{
    class InnerClass{
        int a=2;
        InnerClass(int data){
            a=data;
        }
        void print(){
            System.out.println("Methos Called"+a);
        }
    }
}

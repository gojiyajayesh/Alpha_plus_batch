public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass obj=new OuterClass();
        System.out.println(obj.a);
        // System.out.println(obj.InnerClass);     Static InnerClass are not access using Outerclass Obj
        OuterClass.InnerClass a=new OuterClass.InnerClass(20);
        a.print();
    }    
}
class OuterClass{
    int a=20;
    static class InnerClass{
        int data=90;
        InnerClass(int data){
            this.data=data;
        }
        void print(){
            System.out.println("InnerClass Method " + data);
        }
    }  
}

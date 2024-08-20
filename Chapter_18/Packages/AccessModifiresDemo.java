import ahir.B;

public class AccessModifiresDemo {
public static void main(String[] args) {
    A a=new A();
    a.print();  // class access all modifires
    System.out.println(a.def);  // Default access in same package
    System.out.println(a.pro);  // Protected Access in same package and sub class
    System.out.println(a.pub);  // Public access anyware
    // Protected mate
    C c=new C();
    System.out.println(c.pub);    // only public is access in this class
    System.out.println(c.getPro());   // Pro access in this way
}  
}
class C extends B{
         public void print()
         {
            System.out.println(pro);  // protected is Access in Diffrent Package but SubClass
            System.out.println(pub);  // Public is access in anyware in world
         }
         public String getPro()
         {
            return pro;
         }
}
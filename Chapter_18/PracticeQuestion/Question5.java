public class Question5 {
   public static void main(String[] args) {

      Animal a=new Dog();       // This print a Dog class method because it method is Override Method
      Animal b=new Animal();    // This Print a Animal class Print methid
      a.print();b.print();
      Animal c=new Dog();
      c.print();
     //   c.dog();                  // dog no ref j nai hoy to invoke j nai thay


   } 
}
class Animal{
    void print()
    {
        System.out.println("Print Animal");
    }
}
class Dog extends Animal{
    void dog()
    {
        System.out.println("Dog method called");
    }
    void print()
    {
        System.out.println("Dog Print");
    }
}

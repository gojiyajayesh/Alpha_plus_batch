public class Question4 {
    public static void main(String[] args) {
        Ac a=new Dog();
        a.Aprint();
        //a.Dprint(); // Not Access
        // Dog b=new Ac();
        // b.Dprint();
        // b.Aprint();
    }
}
class Ac{
    String name;
    void Aprint()
    {
        System.out.println("Animal is print ...");
    }
}
class Dog extends Ac{
    String color;
    void Dprint()
    {
        System.out.println("Dog Print...");
    }
}

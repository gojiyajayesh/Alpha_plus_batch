public class HyrarchialInheritanse {
    public static void main(String[] args) {
        
    }
}

class Animals {
    String Color;
    String name;

    void eat() {
        System.out.println("Eat!!");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eat meat!!");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat");
    }
}

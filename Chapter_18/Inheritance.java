public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Allwaz first Perent class constructor is called!!!...
        dog.eat();
    }
}

class Animal {
    String name;
    int age;
    Animal()
    {
        System.out.println("Animal class Constructor is called!!");
    }
    void eat() {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal {
    String color;
    int noOfLegs;
    Dog()
    {
        System.out.println("Dog class Constructor is called!!");
    }
    @Override
    void eat() { // Methid @Override
        System.out.println("Dog is eat meet!");
    }
}
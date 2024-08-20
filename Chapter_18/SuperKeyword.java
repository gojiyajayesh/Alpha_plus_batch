public class SuperKeyword {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.getname();

    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor is called...");
    }

    String name = "Animal";

    void eat() {
        System.out.println("Animal is Eat!!");
    }
}

class Dog extends Animal {
    Dog() {
        super();    // invoke animal class constructor
        System.out.println("Dog Condtructor is called...");
    }

    String name = "Dog";

    void eat() {
        super.eat();   // invoke Animal class method
        System.out.println("Dog is eat");
    }

    void getname() {
        System.out.println(super.name);  // invoke animal class name
        System.out.println(name);
    }
}
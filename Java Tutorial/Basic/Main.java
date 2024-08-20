public class Main {
    public static void main(String[] args) {
      Animal a=new Animal();
      Dog d=(Dog)a;
      d.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal Eat...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eat....");
    }
    void bark(){
        System.out.println("Dog barking...");
    }
}

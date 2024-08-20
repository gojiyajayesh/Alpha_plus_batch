public class AbstatrctonClass {
    public static void main(String[] args) {
        Tata t = new Tata();
        t.brands("Jayesh");
        t.Weels();
    }
}

abstract class Car {
    String name;
    String Model;

    Car() {
        System.out.println("Car Constructor is called...");
    }

    protected void Weels() {
        System.out.println("Car Work on 4 Weel's...");
    }

    abstract protected void brands(String name);
}

class Tata extends Car {
    @Override
    protected void brands(String name) {
        System.out.println("This is tata company's car");
    }
}
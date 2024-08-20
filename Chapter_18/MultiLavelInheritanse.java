public class MultiLavelInheritanse {
public static void main(String[] args) {
    Humans h=new Humans();
    h.humans();
}
}

class Animal {
    String name;
    String color;
    void eat()
    {
        System.out.println("Animals eat");
    }
}

class Mammals extends Animal {
    int nooflegs;
    void memals()
    {
        System.out.println("memmals");
    }
}

class Humans extends Mammals {
    void humans(){
        System.out.println("Humans");
    }
}

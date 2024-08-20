public class SingleInheritance {
    public static void main(String[] args) {
       Tata t=new Tata();
       t.noOfWeels(); 
    }
}
class Car{
    int modelNo;
    String color;
    int Speed;
    void noOfWeels()
    {
        System.out.println("No Of Weels is 4");
    }
}
class Tata extends Car{
    int price;
    int pasingyear;
    void garanti()
    {
        System.out.println("Five year Granti");
    }
}
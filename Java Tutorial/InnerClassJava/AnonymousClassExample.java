public class AnonymousClassExample {
    public static void main(String[] args) {
        // Parent Class method are override without create septreted sub class
        Parent p=new Parent(){
            void ms(){
                System.out.println("This is a Anonymous Class Method called");
            }
        };
        p.ms();
        // jayesh Interface subclass whithout create sapreated class
        Jayesh j=new Jayesh(){
            public void jayesh(){
                System.out.println("Jayesh Interface Anonymous class Method");
            }
        };

        j.jayesh();

        print(new Jayesh(){
            public void jayesh(){
                System.out.println("Jayesh Interface Anonymous class called...!!!");
            }
        });
    }
    // Only One Time Used Jayesh j Subclass object 
    public static void print(Jayesh j){
        j.jayesh();
    }
}
interface Jayesh{
    public void jayesh();
}

class Parent{
    void ms(){
        System.out.println("This is a Parent Method");
    }
}

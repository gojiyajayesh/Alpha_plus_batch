package mainPackage;

public class MainClass {
    String defaultVaribale = "Default";
    protected String protectedVaribale = "protected";
    public String publicVaribale = "public";

    private void privateMethod() {
        System.out.println("Private Methos called!!");
    }

    void defaultMethod() {
        System.out.println("default Methos called!!");
    }

    protected void protectedMethod() {
        System.out.println("protected Methos called!!");
    }

    public void publicMethod() {
        System.out.println("public Methos called!!");
    }

    public MainClass() {
        System.out.println("this is a public constructor called!");
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();

        main.privateMethod();     // Access private method with in same class
        main.defaultMethod();     // Access default methos with in same class & same package
        main.protectedMethod();   // Access protected method with in same class & same package & diffrent package sub class
        main.publicMethod();      // Access public method in anywhare
    }
}

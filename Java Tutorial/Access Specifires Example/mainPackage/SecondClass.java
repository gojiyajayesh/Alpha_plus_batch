package mainPackage;
public class SecondClass {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.defaultMethod(); // Default method is called in same class & same class
        main.protectedMethod(); // Protected method is called in same class & same package & diffrent package subclass
        main.publicMethod(); // Public method is called in any whare
    }
}

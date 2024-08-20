public class StaticKetword {
    static int staticVar = initializeStaticVar();
    
    static {
        System.out.println("Static block called.");
    }
    
    public static int initializeStaticVar() {
        System.out.println("Static variable initialized.");
        return 42;
    }
    
    public static void staticMethod() {
        System.out.println("Static method called.");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method started.");
        StaticKetword.staticMethod();
    }
}

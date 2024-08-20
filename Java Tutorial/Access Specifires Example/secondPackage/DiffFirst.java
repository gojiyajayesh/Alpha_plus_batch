package secondPackage;
import mainPackage.MainClass;
public class DiffFirst extends MainClass{
    public static void main(String[] args) {
        DiffFirst main=new DiffFirst();
        main.protectedMethod();         // Access Protected method same class same package and diffrent package sub class
    }
}

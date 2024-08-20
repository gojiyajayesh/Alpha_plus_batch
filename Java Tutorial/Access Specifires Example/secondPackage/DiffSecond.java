package secondPackage;

import mainPackage.*;

public class DiffSecond {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.publicMethod(); // Only Public method are access this because diffrent package and without sub
                             // class this is a not access in this form
    }
}

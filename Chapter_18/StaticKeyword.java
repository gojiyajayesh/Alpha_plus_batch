public class StaticKeyword {
    public static void main(String[] args) {
        Astatic a = new Astatic();
        Astatic b = new Astatic();
        System.out.println(a.re());
        System.out.println(b.re());
    }
}

class Astatic {
    static String name = "jayesh";
    static int var=10;
    static {
        System.out.println(var);  // Satatic j static ne access kare baki no kare
        System.out.println(
                "This is Static Block it called Only one time when Class is load in first time in Object is Create in java");
    }
    public char[] pub;
    int re()
    {
        return var;
    }
    Astatic() {
        System.out.println(Astatic.name);
        name = "ramesh";
    }
}
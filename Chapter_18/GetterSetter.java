public class GetterSetter {
    public static void main(String[] args) {
        A a = new A();
        // set Private Varivale
        a.setName("jayesh");
        a.setRoll(116063);
        // get Private variable
        System.out.println(a.getName());
        System.out.println(a.getRoll());
    }
}
class A {
    private String name;
    private int roll;

    // Setter Methid's
    void setName(String name) {
        this.name = name;
    }

    void setRoll(int roll) {
        this.roll = roll;
    }

    // Geeter Method's
    String getName() {
        return name;
    }

    int getRoll() {
        return roll;
    }
}

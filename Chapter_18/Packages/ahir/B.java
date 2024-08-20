package ahir;

public class B {
    public String pub = "Public";
    protected String pro = "Protected";
    private String pri = "Private";
    String def = "Default";

    public void print() {
        // inside class all are Accessble
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);
    }
}

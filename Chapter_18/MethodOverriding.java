public class MethodOverriding {
    public static void main(String[] args) {
        ovs v=new ovs();
        v.over();
    }
}
class Ov{
    void over()
    {
        System.out.println("Ov Override methid");
    }
}
class ovs extends Ov{
    void over()// Override Method
    {
        System.out.println("small ov methid");
    }
}

public class Console {
    public static void main(String[] args) {
        String s=String.valueOf(System.console().readPassword());
        System.out.println(s);
    }
}

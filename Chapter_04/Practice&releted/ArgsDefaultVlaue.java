public class ArgsDefaultVlaue {
    public static void main(String[] args) {
        if (args == null) {
            System.out.println("args is null");
        } else if (args.length == 0) {
            System.out.println("args is an empty array");
        } else {
            System.out.println("args has elements");
        }
    }
}

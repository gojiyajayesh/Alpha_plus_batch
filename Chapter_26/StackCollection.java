import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(9);
        stack.pop();
       System.out.println(stack.peek());
    }
}

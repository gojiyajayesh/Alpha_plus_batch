import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        addBottom(0, stack);
        while(!stack.empty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    public static void addBottom(int data,Stack<Integer> stack){
        if(stack.empty())
        {
            stack.push(data);
            return;
        }
        int val=stack.pop();
        addBottom(data, stack);
        stack.push(val);
    }
}

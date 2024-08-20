import java.util.ArrayList;

public class StackArrayList {
    public static class Stack {
        ArrayList<Integer> stack = new ArrayList<>();
        public static int top = -1;

        public void push(int data) {
            top++;
            stack.add(data);
        }

        public Integer pop() {
            if(isEmpty())
            {
                System.out.println("Stack is Empty!");
                return Integer.MAX_VALUE;
            }
            return stack.remove(top--);
        }

        public Integer peek() {
            if(isEmpty())
            {
                System.out.println("Stack is Empty!");
                return Integer.MAX_VALUE;
            }
            return stack.get(top);
        }

        public boolean isEmpty() {
            return stack.size() == 0;
        }

        public int size() {
            return stack.size();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

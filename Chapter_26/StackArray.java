public class StackArray {
    public static class Stack {
        public static int top = -1;
        public static int stack[] = new int[20];

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (top == 19);
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack is full !!");
                return;
            }
            stack[++top] = data;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return Integer.MAX_VALUE;
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return Integer.MAX_VALUE;
            }
            return stack[top];
        }
        public void size()
        {
            System.out.println("Size Of Stack = "+(top+1));
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.peek());
        st.size();
    }
}

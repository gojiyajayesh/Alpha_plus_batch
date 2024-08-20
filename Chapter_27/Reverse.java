import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        System.out.println("Original queue:");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        
        revrese(queue);
        
        System.out.println("\nReverse queue:");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }
    public static void revrese(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}

import java.util.*;
public class ReverceStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverceStack(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    public static void reverceStack(Stack<Integer> s){
        if(s.empty())
        {
            return; 
        }
        int val=s.pop();
        reverceStack(s);
        addBottom(s,val);
    }
    public static void addBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int val=s.pop();
        addBottom(s, data);
        s.push(val);
    }
}

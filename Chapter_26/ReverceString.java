import java.util.Stack;

public class ReverceString {
    public static void main(String[] args) {
        System.out.println(reverceString("Hello"));
    }
    public static String reverceString(String str){
        Stack<Character> stack=new Stack<>();
        int index=0;
        while(index<str.length())
        {
            stack.push(str.charAt(index));
            index++;
        }

        StringBuilder result=new StringBuilder();

        while(!stack.empty())
        {
            result.append(stack.pop());
        }
        return result.toString();
    }
}

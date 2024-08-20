import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("}"));
    }

    public static boolean validParentheses(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            } else {
                if(st.empty()){
                    return false;
                }
                char ch = str.charAt(i);
                switch (ch) {
                    case ')':
                        if (st.peek() != '(')
                            return false;
                        break;
                    case '}':
                        if (st.peek() != '{')
                            return false;
                        break;
                    case ']':
                        if (st.peek() != '[')
                            return false;
                        break;
                    default:
                        break;
                }
                st.pop();
            }
        }
        return st.empty();
    }
}
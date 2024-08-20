import java.util.Stack;

public class DublicateParentheses {
    public static void main(String[] args) {
        System.out.println(dublicateParentheses("((c+d))"));
    }

    public static boolean dublicateParentheses(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                int count = 0;
                while (true) {
                    if ((ch == ')' && st.pop() == '(') || (ch == '}' && st.pop() == '{')
                            || (ch == ']' && st.pop() == '[')) {
                        break;
                    }
                    count++;
                }
                if (count < 1)
                    return true;
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}

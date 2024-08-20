import java.util.Stack;

public class NExtGreaterElement {
    public static void main(String[] args) {
        int[] stock = { 6, 8, 0, 1, 3 };
        int[] nextGreater = nextGreaterElement2(stock);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i + 1;
            while (j < arr.length) {
                if (currentElement < arr[j]) {
                    result[i] = arr[j];
                    break;
                }
                j++;
            }
            if (result[i] == 0)
                result[i] = -1;
        }
        return result;
    }

    public static int[] nextGreaterElement2(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        st.push(arr.length - 1);
        result[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int currentElement = arr[i];
            while (!st.empty() && arr[st.peek()] < currentElement) {
                st.pop();
            }
            if (st.empty()) {
                result[i] = -1;
            } else {
                result[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return result;
    }
}

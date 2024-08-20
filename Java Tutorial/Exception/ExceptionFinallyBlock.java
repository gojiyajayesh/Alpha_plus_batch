public class ExceptionFinallyBlock {
    /**
     * In the code you provided, the `finally` block always executes after the `try`
     * and `catch` blocks, regardless of whether an exception is thrown or not.
     * 
     * Here's how the code execution flows:
     * 
     * 1. **`try` Block**: The `try` block throws an `ArithmeticException`.
     * 2. **`catch` Block**: The `catch` block catches the `ArithmeticException` and
     * immediately throws a new `RuntimeException`.
     * 3. **`finally` Block**: The `finally` block always executes after the `try`
     * or `catch` blocks, regardless of whether an exception was thrown or caught.
     * In this case, it throws a `NullPointerException`.
     * 
     * When an exception is thrown in both the `catch` and `finally` blocks, the
     * exception thrown in the `finally` block will override any exception thrown in
     * the `catch` block. This means the `RuntimeException` thrown by the `catch`
     * block is suppressed, and the `NullPointerException` from the `finally` block
     * is the one that gets propagated.
     * 
     * In summary:
     * - The `catch` block does throw a `RuntimeException`, but it gets overridden
     * by the `NullPointerException` thrown in the `finally` block.
     * - The `finally` block's exception is the one that gets propagated because it
     * occurs last in the sequence of exception handling.
     * 
     * If you want to see the exception from the `catch` block, you would need to
     * avoid throwing an exception in the `finally` block.
     * 
     * @param args
     */
    @SuppressWarnings("finally")
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("ArithmeticException!!..");
        } catch (ArithmeticException e) {
            throw new RuntimeException("RuntimeException!!..");
        } finally {
            throw new NullPointerException("NullPointerException!!!...");
        }
    }
}

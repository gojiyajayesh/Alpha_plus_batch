public class LabeledForLoopExample {
    public static void main(String[] args) {
        outerLoop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i * j > 10) {
                    break outerLoop; // Exits the outer loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}

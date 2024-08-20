public class PrecisionLossExample {
    public static void main(String[] args) {

        // Large long value with many decimal places
        long preciseValue = 1234567890123456789L;

        // Convert to float (may lose precision)
        float lessPreciseValue = (float) preciseValue;

        // Print original and converted values
        System.out.println("Original long value (precise): " + preciseValue);
        System.out.println("Converted to float (less precise): " + lessPreciseValue);
    }
}

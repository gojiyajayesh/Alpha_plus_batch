public class IEEEExample {
    public static void main(String[] args) {
        float f1 = 1.0f / 3.0f;
        double d1 = 1.0 / 3.0;
        System.out.println("Float result: " + f1);
        System.out.println("Double result: " + d1);

        double positiveInfinity = 1.0 / 0.0;
        double negativeInfinity = -1.0 / 0.0;
        double nanValue = 0.0 / 0.0;

        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("NaN: " + nanValue);

        // Rounding modes can be tested with BigDecimal (not covered by IEEE 754 directly but related)
    }
}

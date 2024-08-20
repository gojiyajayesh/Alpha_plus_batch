public class MathFunction {
    public static void main(String[] args) {
System.out.println(pow(3,-4));
    }

    public static double abs(double a) {
        return (a < 0) ? -a : a;
    }

    public static double avg(double[] number) {
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result += number[i];
        }
        return result / number.length;
    }

    public static double min(double a, double b) {
        return (a <= b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a <= b) ? b : a;
    }

    public static double sqrt(double number) {
        double sqrt = number / 2;
        double temp = 0;
        do {
            temp = sqrt;
            sqrt = (temp + (number / temp)) / 2;
        } while ((abs(temp - sqrt) >= 0.0001));
        return sqrt;
    }

    public static double pow(double base, double pow) {
        if (pow == 0) {
            return 1.0;
        }
        if (pow == 1)
            return base;
        if (base == 0)
            return 0;
        if (pow < 0) {
           return pow(1/ base, -pow);
        }
        if (pow % 2 == 0) {
            double half = pow(base, pow / 2);
            return half * half;
        } else {
            return base * pow(base, pow - 1);
        }
    }
}

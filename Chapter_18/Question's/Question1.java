public class Question1 {
    public static void main(String[] args) {
        Complex A = new Complex(1, 1);
        Complex B = new Complex(6, -5);
        Complex.printComplex(Complex.Sum(A, B));
        Complex.printComplex(Complex.Dif(A, B));
        Complex.printComplex(Complex.Mul(A, B));

    }
}

class Complex {
    int real;
    int image;

    Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public static void printComplex(Complex a) {
        char sign = (a.image < 0) ? '-' : '+';
        System.out.println(a.real + "" + sign + "" + Math.abs(a.image) + "i");
    }

    public static Complex Sum(Complex a, Complex b) {
        Complex result = new Complex(a.real + b.real, a.image + b.image);
        return result;
    }

    public static Complex Dif(Complex a, Complex b) {
        Complex result = new Complex(a.real - b.real, a.image - b.image);
        return result;
    }

    public static Complex Mul(Complex a, Complex b) {
        int x = (a.real * b.real) - (a.image * b.image);
        int y = (a.real * b.image) + (a.image * b.real);
        return new Complex(x, y);
    }
}
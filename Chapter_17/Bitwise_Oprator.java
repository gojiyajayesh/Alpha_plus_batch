/**
 * Bitwise_Oprator
 */
public class Bitwise_Oprator {
    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println((5 & 6)); // AND
        System.out.println((5 | 6)); // OR
        System.out.println((5 ^ 6)); // XOR
        System.out.println(~5); // 1's Complement 0's <--> 1's
        System.out.println(~0); // Output -1 because 2's Complement to find binary to decimal
        System.out.println(~a); /*
                                 * if number is small thenFirst 8-bit is used other bit is not consider to
                                 * chalega baki compiler to karta hi hai
                                 */
        System.out.println((5 << 2)); // Binary Left Shift Oprator formula X=a*2^b
        System.out.println(-127 << 1); // nagative number not change formula
        System.out.println(-10 >> 3); // nagative number MSB Not add 0's it add upaer value's
    }
}
package interview;

public class GCD {
    // Method to find GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int number1 = 56;
        int number2 = 98;

        // Find GCD
        int gcd = findGCD(number1, number2);

        // Print the result
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}

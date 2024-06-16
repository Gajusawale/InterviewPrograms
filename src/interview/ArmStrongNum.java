package interview;

public class ArmStrongNum {

    public static void main(String[] args) {

        String numberStr = "1234";

        // Using Integer.parseInt(String s)
        int number1 = Integer.parseInt(numberStr);
        System.out.println("Using parseInt: " + number1);

        // Using Integer.valueOf(String s)
        String number2 = String.valueOf(numberStr);
        System.out.println("Using valueOf: " + number2);

        int num=153;

        System.out.println(isArmStrong(num));

    }

    private static boolean isArmStrong(int number) {

        String numberStr = String.valueOf(number);
        int numDigits = numberStr.length();
        int sum = 0;
        int temp = number;
        while(temp!=0)
        {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

            return sum==number;


    }
}

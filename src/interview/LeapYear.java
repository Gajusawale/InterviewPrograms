package interview;

public class LeapYear {

    public static void main(String[] args) {
        int year=2020;
        boolean isLeapYear=isLeapYear(year);
        System.out.println(isLeapYear);

    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It is evenly divisible by 4
        // 2. If it is divisible by 100, it must also be divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

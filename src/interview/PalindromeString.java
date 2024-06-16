package interview;

public class PalindromeString {
    public static void main(String[] args) {


        String str="abccba";

        int left = 0;
        int right = str.length() - 1;
        boolean check=true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                check=false;
                break;
            }
            left++;
            right--;

        }
        if(check)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");


    }
}


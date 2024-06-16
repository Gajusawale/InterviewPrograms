package interview;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num=12321;
        int temp=num;

        int reverseNum=0;
        while(num!=0)
        {
            int digit=num%10;
            reverseNum=reverseNum*10+digit;
            num/=10;
        }

        if(reverseNum==temp)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}

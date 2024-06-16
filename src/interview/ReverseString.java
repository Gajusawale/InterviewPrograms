package interview;

public class ReverseString {
    public static void main(String[] args) {
        String str="Gajanan Sawale";

        System.out.println("Original String "+str);

        String reverseString="";

        char[] charArray=str.toCharArray();
        int left=0;
        int right=charArray.length -1;

        while(right>left)
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;

            left++;
            right--;
        }
        reverseString=new String(charArray);

        System.out.println("reverse String "+ reverseString);


    }
}

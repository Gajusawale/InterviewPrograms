package algoritms;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="dcba";

        if(checkAnagram(str1,str2))
        {
            System.out.println("given String are anagrams");
        }
        else
            System.out.println("give String are not Anagrams");

    }

    private static boolean checkAnagram(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;

        char[] str1Array=str1.toCharArray();
        char[] str2Array=str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array,str2Array);
    }
}

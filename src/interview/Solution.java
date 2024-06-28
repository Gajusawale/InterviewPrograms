package interview;

public class Solution {

    public static void main(String[] args) {
        String str="25403196";
        int num=6;

        int intArray[]=new int[str.length()];

        int index=0;
        for(int i=0;i<str.length();i++)
        {
            String str1="";
            str1+=str.charAt(i);

            intArray[index++]=Integer.parseInt(str1);

        }


        for(int i=0;i<intArray.length;i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {

                if(intArray[i]+intArray[j]==num)
                {
                    System.out.println(intArray[i]+" "+intArray[j]);
                }
            }
        }
    }
}

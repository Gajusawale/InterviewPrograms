package interview;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        int arr[]={2,2,3,1,4,5,7,8,3};


        int uniquArray[]=removeDuplicate( arr);

        for(int a:uniquArray)
        {
            System.out.print(a+" ");
        }

    }

    private static int[] removeDuplicate(int[] arr) {

        sortArray(arr);

        int temp[]=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }

        temp[j++]=arr[arr.length-1];


        int result[]=new int[j];
        System.arraycopy(temp,0,result,0,j);

        return result;

    }

    private static void sortArray(int[] arr) {

        int n= arr.length-1;

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


}

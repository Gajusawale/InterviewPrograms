package interview;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={2,4,5,3,5,3,1};

        int s=0;
        int l=arr.length-1;

        while (s<l)
        {
            int temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;
        }

        for(int a:arr)
        {
            System.out.println(a);
        }
    }


}

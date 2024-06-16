package dsa.search;

public class BinarySearch {

    int binarySearch(int arr[],int x)
    {
        int low=0,high=arr.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==x)
                return mid;

            if(arr[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }


    final public static void main(String[] args) {
        BinarySearch ob=new BinarySearch();
        int arr[]={2,3,4,10,40};

        int n=arr.length;

        int x=10;

        int result=ob.binarySearch(arr,x);
        System.out.println(result);
    }

}

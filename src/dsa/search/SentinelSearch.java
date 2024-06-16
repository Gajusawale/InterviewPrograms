package dsa.search;

public class SentinelSearch {

    void search(int arr[],int value)
    {
        int n=arr.length;
        int last=arr[n-1];

        arr[n-1]=value;

        int i=0;

        while(arr[i]!=value)
            i++;

        arr[n-1]=last;

        if((i<n-1)||(arr[n-1]==value))
            System.out.println(value+" is present at index");
        else
            System.out.println("Element Not found");
    }

}

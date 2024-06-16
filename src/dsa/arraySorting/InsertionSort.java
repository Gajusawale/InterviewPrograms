package dsa.arraySorting;

public class InsertionSort {

    void sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }

            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort=new InsertionSort();

        int arr[]={3,2,5,7,8,3,1};

        insertionSort.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}

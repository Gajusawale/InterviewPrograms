package dsa.arraySorting;

public class SelectionSort {

    void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;


                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }


        }
    }


    public static void main(String[] args) {

        SelectionSort sl=new SelectionSort();
        int arr[]={64,2,3,5,1};

        sl.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

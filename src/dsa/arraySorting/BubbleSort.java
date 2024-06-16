package dsa.arraySorting;

public class BubbleSort {

    void sort(int arr[],int n)
    {
        int i,j, temp;
        boolean swapped;

        for(i=0;i<n-1;i++)
        {
             swapped=false;
             for( j=0;j<n-i-1;j++)
             {
               if(arr[j]>arr[j+1])
               {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapped=true;
               }
             }
             if(swapped==false)
                 break;

        }
    }

    public static void main(String[] args) {
        BubbleSort bl=new BubbleSort();
        int arr[]={64,2,3,5,1};

        bl.sort(arr,arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

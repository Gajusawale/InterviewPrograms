package interview;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,2,5,6,7,8};

        int target=3;
      mergeSort(arr, 0, arr.length - 1);;

       for(int a:arr)
           System.out.println(a);

        System.out.println( binarySearch(arr,target));
     ;
    }

    private static int binarySearch(int [] arr,int target) {

        int start=0;
        int end=arr.length-1;


        while(start<=end)
        {
            int mid=(start+end)/2;

            if(arr[mid]==target)
                return mid;
            if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;

    }


    // Method to implement merge sort

        // Method to merge two subarrays L and R into arr
        static void merge(int arr[], int left, int middle, int right) {
            int n1 = middle - left + 1;
            int n2 = right - middle;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = arr[left + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[middle + 1 + j];

            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Method to implement merge sort
        static void mergeSort(int arr[], int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;

                mergeSort(arr, left, middle);
                mergeSort(arr, middle + 1, right);

                merge(arr, left, middle, right);
            }
        }


}

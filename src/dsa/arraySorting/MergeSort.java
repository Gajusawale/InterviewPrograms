package dsa.arraySorting;

public class MergeSort {

    public static void main(String[] args) {
        int [] array={12,11,13,5,6,7};

        System.out.println("Given Array");

        MergeSort ms=new MergeSort();
        ms.mergeSort(array,0,array.length-1);

        for(int a:array)
        {
            System.out.println(a);
        }

    }

     void mergeSort(int[] array, int l, int r) {

        if(l<r) {
            int mid = (l + r) / 2;

            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, r);

            merge(array, l, mid, r);
        }
    }

    void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temp arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[middle + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

}

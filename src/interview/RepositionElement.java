package interview;

import java.util.Arrays;

public class RepositionElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 4;

        int[] result = repositionElement(arr, num);
        System.out.println(Arrays.toString(result));
    }

    public static int[] repositionElement(int[] arr, int num) {
        int index = -1;
        // Find the index of the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        // If element is not found, return the original array
        if (index == -1) {
            return arr;
        }

        // Create a new array to hold the result
        int[] result = new int[arr.length];
        result[0] = num;

        // Copy elements before the found index
        for (int i = 0; i < index; i++) {
            result[i + 1] = arr[i];
        }

        // Copy elements after the found index
        for (int i = index + 1; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}


package algoritms;

public class FindMissingNum {
    public static void main(String[] args) {

//        int arr[]={1,2,3,5,6,7};
//
//        for(int i=1;i<=arr.length;i++)
//        {
//            if(i!=arr[i-1])
//            {
//                System.out.println(i);
//                break;
//            }
//        }

        int[] array = {1, 2, 3, 5, 6, 7};
        int n = array.length + 1; // since one number is missing

        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the given array
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);

    }
}

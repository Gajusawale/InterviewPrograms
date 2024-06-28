package interview;

import java.util.HashSet;
import java.util.Set;

public class InterviewAskQuestion {

    public static void main(String[] args) {
        String str = "25403196";
        int num = 6;

        int intArray[] = new int[str.length()];

        // Convert string to integer array
        for (int i = 0; i < str.length(); i++) {
            intArray[i] = Character.getNumericValue(str.charAt(i));
        }

        // Use a set to track the elements
        Set<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < intArray.length; i++) {
            int complement = num - intArray[i];

            if (seenNumbers.contains(complement)) {
                System.out.println(intArray[i] + " " + complement);
            }

            seenNumbers.add(intArray[i]);
        }
    }
}

package interview;

import java.util.HashMap;
import java.util.Map;

public class StringRepChar {
    public static void main(String[] args) {

        String str = "hello world";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print characters that appear more than once
        System.out.println("Repetitive characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }



    }
}

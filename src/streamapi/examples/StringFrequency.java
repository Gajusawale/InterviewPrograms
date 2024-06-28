package streamapi.examples;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringFrequency {

    public static long countFrequency(String[] str, String target) {
        Map<String, Long> frequencyMap = Stream.of(str)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequencyMap.getOrDefault(target, 0L);
    }

    public static void main(String[] args) {
        String[] fruits = {"Apple", "banana", "Mango", "Apple"};
        String targetFruit = "Apple";
        long frequency = countFrequency(fruits, targetFruit);
        System.out.println("Frequency of '" + targetFruit + "' in the array: " + frequency);
    }
}

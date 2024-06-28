import jdk.jfr.Frequency;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChar {
    public static void main(String[] args) {
        String str="Gajanan";

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((k,v)-> System.out.println(k+" "+v));
    }
}

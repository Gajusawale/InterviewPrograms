package streamapi.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatative {
    public static void main(String[] args) {
        String s="aabbcc";
        String result=findFirstNonRep(s);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

     static String findFirstNonRep(String s) {

       Map<Character,Long> charMap=  s.chars().mapToObj(c->(char)c)
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));


         return charMap.entrySet().stream()
                 .filter(entry -> entry.getValue() == 1)
                 .map(Map.Entry::getKey)
                 .map(String::valueOf)
                 .findFirst()
                 .orElse("-1");

     }
}

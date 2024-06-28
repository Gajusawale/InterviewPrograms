package streamapi.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnagramString {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(e->e+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}

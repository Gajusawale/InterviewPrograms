package algoritms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);

        numbers.stream().filter(e->!(e%2==0)).forEach(System.out::println);
    }
}

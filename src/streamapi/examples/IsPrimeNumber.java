package streamapi.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IsPrimeNumber {

    public static void main(String[] args) {

        int num=11;

        List<Integer> list= Arrays.asList(2,3,4,5,6,7);

        list.stream().
                filter(IsPrimeNumber::isPrime).forEach(System.out::println);

        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {

        return num>1 && IntStream.range(2,num)
                .noneMatch(i->num%i==0);

    }
}

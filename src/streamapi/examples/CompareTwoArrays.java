package streamapi.examples;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


public class CompareTwoArrays {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        boolean areEqual = Arrays.equals(a,b);

        System.out.println(areEqual);

        List<Integer> listA= Arrays.stream(a).boxed().toList();
        List<Integer> listB= Arrays.stream(b).boxed().toList();

    boolean listEquals = listA.equals(listB);

        System.out.println(listEquals);

        List<Integer> list=Arrays.asList(2,3,7,7,8,97);

        List<Integer> sortedUniqueList= list.stream().sorted().distinct().collect(Collectors.toList());

        System.out.println(sortedUniqueList);


//        boolean areEqual1 =

        System.out.println(listEquals); // true




    }
}

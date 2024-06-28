package streamapi.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,12,34,34,56,56);

        Set<Integer> sets=new HashSet<>();

       list= list.stream().filter(e->!sets.add(e)).collect(Collectors.toList());

        System.out.println(list);

    }
}

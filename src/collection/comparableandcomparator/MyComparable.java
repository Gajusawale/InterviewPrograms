package collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {

    public static void main(String[] args) {

        List<Car1> lists=new ArrayList<>();
        lists.add(new Car1("suv","diesel"));
        lists.add(new Car1("sudan","hybrid"));
        lists.add(new Car1("sport","diesel"));

        Collections.sort(lists);

        System.out.println(lists);
    }
}

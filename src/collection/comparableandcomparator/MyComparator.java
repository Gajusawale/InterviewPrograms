package collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.List;

public class MyComparator {

    public static void main(String[] args) {

        List<Car> lists=new ArrayList<>();
        lists.add(new Car("suv","diesel"));
        lists.add(new Car("sudan","hybrid"));
        lists.add(new Car("sport","diesel"));

        lists.sort((obj1,obj2)->obj1.carName.compareTo(obj2.carName));

        lists.forEach((obj)-> System.out.println(obj.carName));
    }
}

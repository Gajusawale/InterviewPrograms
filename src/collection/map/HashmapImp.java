package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapImp {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("sada",1);
        map.put("Gajaann",2);
        map.put("mahes",3);

        for( Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

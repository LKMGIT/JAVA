package August.day17.collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);


        String key = "A";
        int value = map.get(key);
        System.out.println(value);
        System.out.println();

        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();

        while (iterator.hasNext()) {
            String key2 = iterator.next();
            Integer value2 = map.get(key2);
            System.out.println(key2 + ":" + value2);
        }

        System.out.println();


    }
}

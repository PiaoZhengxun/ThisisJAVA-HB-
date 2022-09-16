package chapter15_CellectionFramework.map.hashMap;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        //create map collection
        Map<String, Integer> map = new HashMap<>();

        //put objects
        map.put("Shin", 85);
        map.put("Hong", 90);
        map.put("Dong", 80);
        map.put("Hong", 95);
        System.out.println("total amount of entry : " + map.size());

        //find the object
        System.out.println("\tHong : " + map.get("Hong"));
        System.out.println();

        //run object one by one
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        //remove the object
        map.remove("Hong");
        System.out.println("total amount of entry : " + map.size());

        //run object one by one
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        //remove all objects
        map.clear();
        System.out.println("total amount of entry : " + map.size());
    }
}

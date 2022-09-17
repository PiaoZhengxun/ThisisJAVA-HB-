package chapter15_CellectionFramework.exercise.question9;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int minScore = 0;
        int averageScore = 0;

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        while (iterator.hasNext()) {
            name = iterator.next();
            averageScore += map.get(name);
            treeMap.put(map.get(name), name);
        }


        System.out.println("average score :" + averageScore / map.size());

        System.out.println("highest score :" + treeMap.lastKey());

        System.out.println("highest name :" + treeMap.lastEntry().getValue());


    }

}

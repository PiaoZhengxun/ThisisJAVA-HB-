package chapter15_CellectionFramework.exercise.question9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
        for (Map.Entry<String, Integer> entry : mapEntry) {
            totalScore += entry.getValue();
            if (entry.getValue() > maxScore){
                name = entry.getKey();
                maxScore = entry.getValue();
            }
        }

        System.out.println("average score :"+totalScore/map.size());
        System.out.println("highest score :"+maxScore);
        System.out.println("highest score name :"+name);
    }
}

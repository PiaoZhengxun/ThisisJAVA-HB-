package chapter15_CellectionFramework.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "Hong");
        scores.put(new Integer(98), "Lee");
        scores.put(new Integer(75), "Park");
        scores.put(new Integer(95), "Shin");
        scores.put(new Integer(80), "Kim");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.println("first entry: " + entry);

        entry = scores.lastEntry();
        System.out.println("last entry : " + entry);

        entry = scores.lowerEntry(new Integer(95));
        System.out.println("lower than 95 : " + entry);

        entry = scores.higherEntry(new Integer(95));
        System.out.println("higher than 95 : " + entry);

        entry = scores.floorEntry(new Integer(95));
        System.out.println("95 or lower : " + entry);

        entry = scores.ceilingEntry(new Integer(85));
        System.out.println("85 or higher :  " + entry.getKey()+"-"+entry.getValue());

        entry = scores.ceilingEntry(new Integer(85));
        System.out.println("85 or higher :  " + entry.getKey()+"    "+entry.getValue());

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-" + entry.getValue() + "(left objects :" + scores.size() + ")");
        }
    }
}

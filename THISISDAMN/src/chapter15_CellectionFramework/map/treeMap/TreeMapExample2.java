package chapter15_CellectionFramework.map.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "Hong");
        scores.put(new Integer(98), "Lee");
        scores.put(new Integer(75), "Park");
        scores.put(new Integer(95), "Shin");
        scores.put(new Integer(80), "Kim");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.print(entry.getKey() + "--" + entry.getValue() + " ");
        }
        System.out.println();

        NavigableMap<Integer,String> ascendingMap   = scores.descendingMap().descendingMap();
        Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
            System.out.print(entry.getKey() + "--" + entry.getValue() + " ");
        }
        System.out.println();
    }
}

package chapter15_CellectionFramework.setCollection.treeSet;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[Searching for the letter among c~f]");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        for (String word : rangeSet) {
            System.out.println(word);
        }

        TreeSet<Integer> testSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            testSet.add(i);
        }

        NavigableSet<Integer> see = testSet.descendingSet();
        for (int look :
                see) {
            System.out.print(look + " ");
        }
        System.out.println();

        NavigableSet<Integer> setRange = testSet.subSet(2,true,4,false);
        for (int rangeint :
                setRange) {
            System.out.print(rangeint + " ");
        }


    }
}

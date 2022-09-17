package chapter15_CellectionFramework.setCollection.treeSet;

import chapter13_Generic.wildcardType.WildcardExample;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

//        scores.add(87);
//        scores.add(98);
//        scores.add(75);
//        scores.add(95);
//        scores.add(80);


        Integer score = null;

        score = scores.first();
        System.out.println("lowest num : " + score);

        score = scores.last();
        System.out.println("highest num :" + score + "\n");

        score = scores.lower(new Integer(95));
        System.out.println("lower than 95 :" + score);

        score = scores.higher(new Integer(95));
        System.out.println("higher than 95 :" + score + "\n");

        score = scores.floor(new Integer(95));
        System.out.println("95 or lower than 95 :" + score);

        score = scores.ceiling(new Integer(85));
        System.out.println("85 or higher than 85 :  " + score + "\n");

        while (!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score + "(left objects num : " + scores.size() + ")");
        }


    }
}

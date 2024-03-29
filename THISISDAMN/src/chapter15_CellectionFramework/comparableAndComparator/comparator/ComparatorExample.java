package chapter15_CellectionFramework.comparableAndComparator.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        /*
        TreeSet<Fruit> treeSet = new TreeSet<>();
        treeSet.add(new Fruit("grape", 3000 ));
        treeSet.add(new Fruit("watermelon", 10000 ));
        treeSet.add(new Fruit("strawberry", 6000 ));
        */

        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("grape", 3000 ));
        treeSet.add(new Fruit("watermelon", 10000 ));
        treeSet.add(new Fruit("strawberry", 6000 ));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name +":"+fruit.price);
        }

    }
}

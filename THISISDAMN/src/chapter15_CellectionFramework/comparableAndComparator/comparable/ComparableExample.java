package chapter15_CellectionFramework.comparableAndComparator.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("hong", 45));
        treeSet.add(new Person("Gam", 25));
        treeSet.add(new Person("Park", 31));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + ":" + person.age);
        }


    }
}

package chapter15_CellectionFramework.setCollection.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("total num : " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("total num : " + set.size());

        iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println("\t" + str);
        }

        set.clear();
        if (set.isEmpty()){
            System.out.println("empty");
        }

    }
}

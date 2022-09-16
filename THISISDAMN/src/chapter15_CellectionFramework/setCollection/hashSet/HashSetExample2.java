package chapter15_CellectionFramework.setCollection.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("name", 30));
        set.add(new Member("name", 30));

        System.out.println("total num of objects :  " + set.size());
    }
}

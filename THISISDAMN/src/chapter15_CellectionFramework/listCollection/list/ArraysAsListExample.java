package chapter15_CellectionFramework.listCollection.list;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("name1", "name2", "name3");
        for (String str :
                list1) {
            System.out.println(str);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        for (int value :
                list2) {
            System.out.println(value);
        }
    }
}

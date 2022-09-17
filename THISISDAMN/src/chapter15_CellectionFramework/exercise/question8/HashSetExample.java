package chapter15_CellectionFramework.exercise.question8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "Hong"));
        set.add(new Student(2, "Shin"));
        set.add(new Student(1, "Joe"));

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.studentNum + ":" + student.name);
        }
    }
}

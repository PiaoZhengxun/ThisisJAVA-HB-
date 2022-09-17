package chapter15_CellectionFramework.exercise.question10;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<Student>();

        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("highest score :" + student.score);
        System.out.println("highest id :" + student.id);

    }
}

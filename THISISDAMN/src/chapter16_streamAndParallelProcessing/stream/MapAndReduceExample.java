package chapter16_streamAndParallelProcessing.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("name1", 10),
                new Student("name2", 20),
                new Student("name3", 30)
        );

        double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();

        System.out.println("average score:"+avg);
    }
}

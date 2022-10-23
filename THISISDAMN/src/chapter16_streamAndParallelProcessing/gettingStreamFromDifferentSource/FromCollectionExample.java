package chapter16_streamAndParallelProcessing.gettingStreamFromDifferentSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("name1", 10),
                new Student("name2", 20),
                new Student("name3", 30)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));

    }
}

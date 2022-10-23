package chapter16_streamAndParallelProcessing.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("name1", "name2", "name3", "name4", "name5");

        //sequential processing
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);
        System.out.println();

        //Parallel Processing
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}


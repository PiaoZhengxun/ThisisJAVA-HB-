package chapter16_streamAndParallelProcessing.gettingStreamFromDifferentSource;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {
                "name1", "name2", "name3"
        };
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.print(a + " "));


        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = IntStream.of(intArray);
        intStream.forEach(a -> System.out.print(a + " "));

    }
}

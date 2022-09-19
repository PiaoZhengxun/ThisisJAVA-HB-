package chapter16_streamAndParallelProcessing.iteratorStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hong", "Shin", "Kim");

        //using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();

        //using stream
        Stream<String> stream = list.stream();
        stream.forEach( name -> System.out.println(name));
    }
}

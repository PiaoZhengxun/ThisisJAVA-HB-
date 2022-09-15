package chapter14_LambdaExpressions.standardFunctionalInterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
    private static List<Student> list = Arrays.asList(
            new Student("hong", 90, 96),
            new Student("Shin", 95, 93)
    );

    public static void printString(Function<Student, String> function) {
        for (Student student :
                list) {
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function){
        for (Student student :
                list) {
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[Student Name]");
        printString(t -> t.getName());

        System.out.println("[English Score]");
        printInt(t -> t.getEnglishScore());

        System.out.println("[Math Score]");
        printInt(t -> t.getMathScore());
    }
}

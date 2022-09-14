package chapter14_LamdaExpression.standardFunctionalInterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
            new Student("hong", 90, 95),
            new Student("shin", 95, 93)
    );

    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student :
                list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / list.size();
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("English Average : " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("Math Average : " + mathAvg);
    }
}

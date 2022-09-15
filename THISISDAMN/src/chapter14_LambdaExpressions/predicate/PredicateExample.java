package chapter14_LambdaExpressions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("n1", "male", 90),
            new Student("n2", "female", 90),
            new Student("n3", "male", 95),
            new Student("n4", "female", 92)
    );

    public static double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student :
                list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("male"));
        System.out.println("male avg score : " + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals("female"));
        System.out.println("female avg score :" + femaleAvg);
    }
}

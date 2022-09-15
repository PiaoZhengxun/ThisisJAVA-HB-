package chapter14_LambdaExpressions.exercise.question6;

import java.util.function.DoubleUnaryOperator;
import java.util.function.ToIntFunction;

public class LambdaExample {
    //try to find the average score of english and math of students
    //declare avg() method

    private static Student[] students = {
            new Student("name1", 90, 96),
            new Student("name2", 95, 93)
    };

    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        int count = 0;
        for (Student student :
                students) {
            sum += function.applyAsInt(student);
            count++;
        }
        double avgScore = (double) sum / count;
        return avgScore;
    }


    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("Average score of English : " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("Average score of Mathematics : " + mathAvg);
    }

}

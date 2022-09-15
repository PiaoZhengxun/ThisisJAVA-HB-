package chapter14_LambdaExpressions.exercise.question5;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score :
                scores) {
            result = operator.applyAsInt(result, score);
        } ;
        return result;
    }

    public static void main(String[] args) {
        //get max num
        int max = maxOrMin(
                (x, y) -> {
                    if (x > y) {
                        return x;
                    } else {
                        return y;
                    }
                }
        );

        System.out.println("MAX : " + max);

        //get min num
        int min = maxOrMin(
                (x, y) -> {
                    if (x > y) {
                        return y;
                    } else {
                        return x;
                    }
                }
        );

        System.out.println("MIN : " + min);
    }
}

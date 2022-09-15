package chapter14_LambdaExpressions.predicate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //check the multiple of two
        IntPredicate predicateA = a -> a%2 ==0;

        //check the multiple of three
        IntPredicate predicateB = a->a%3==0;

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("is the nine the multiples of two and three? : " + result);

        //or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("is the nine the multiples of two or three? : " + result);

        //negate();
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("is the nine odd? : " + result);
    }
}

package chapter14_LambdaExpressions.methodReferences.constructorReferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member = function1.apply("one string");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member1 = function2.apply("first string", "second string");
    }
}
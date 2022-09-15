package chapter14_LambdaExpressions.methodReferences.argumentMethodReferences;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

    public static void print(int order){
        if(order < 0){
            System.out.println(order + "/ /-1");
        } else if(order == 0){
            System.out.println(order + " // 0");
        } else {
            System.out.println(order + " // 1");
        }
    }

    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a,b)->a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8","JAVA8"));

        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("Java8","JAVA8"));

    }

}

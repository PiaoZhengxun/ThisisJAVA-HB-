package chapter14_LambdaExpressions.methodReferences.staticAndInstanceMethod;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //references static method
        operator = (x,y) -> Calculator.staticMethod(x , y);
        System.out.println("result 1 : "  + operator.applyAsInt(1 ,2));

        operator = Calculator :: staticMethod;
        System.out.println("result 2 : " + operator.applyAsInt(3,4));

        //references instance method
        Calculator ojb = new Calculator();
        operator = (x,y) -> ojb.instanceMethod(x , y);
        System.out.println("result 3 : " + operator.applyAsInt(5, 6));

        operator = ojb :: instanceMethod;
        System.out.println("result 4 : " + operator.applyAsInt(7, 8));
    }
}

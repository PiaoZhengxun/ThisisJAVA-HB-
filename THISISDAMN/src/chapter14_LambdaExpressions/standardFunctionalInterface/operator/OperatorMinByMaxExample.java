package chapter14_LambdaExpressions.standardFunctionalInterface.operator;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxExample {
    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));

        fruit = binaryOperator.apply(new Fruit("Strawberry", 6000), new Fruit("Watermelon", 10000));
        System.out.println(fruit.name);

        binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
        fruit = binaryOperator.apply(new Fruit("starberry", 6000), new Fruit("watermelon", 10000));
        System.out.println(fruit.name);
    }
}

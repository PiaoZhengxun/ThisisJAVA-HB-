package chapter14_LambdaExpressions.consumerAndThen;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> {
            System.out.println("ConsumerA : " + m.getName());
        };

        Consumer<Member> consumerB = (m) -> {
            System.out.println("ConsumerB : " + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("Hong", "ID", null));
    }
}

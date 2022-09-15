package chapter14_LambdaExpressions.standardFunctionalInterface;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 11; i++) {
                System.out.println(i+"w2");
            }
        });
        thread1.start();
    }
}

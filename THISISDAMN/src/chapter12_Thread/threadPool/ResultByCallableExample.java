package chapter12_Thread.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[Processing Request]");

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i < 11; i++) {
                    sum += i;

                }
                return sum;
            }
        };

        Future<Integer> future = executorService.submit(callable);

        try {
            int sum = future.get();
            System.out.println("[Process Result] : " + sum);
            System.out.println("[Processing Done]");
        } catch (Exception e){
            System.out.println("[Exeception occurs] : " + e.getMessage());
        }

        executorService.shutdown();
    }
}

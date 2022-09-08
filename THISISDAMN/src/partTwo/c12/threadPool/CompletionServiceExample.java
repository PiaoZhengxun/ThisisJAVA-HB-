package partTwo.c12.threadPool;

import java.util.concurrent.*;

public class CompletionServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[Request process]");

        for (int i = 0; i < 3; i++) {
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int j = 1; j <= 10; j++) {
                        sum += j;
                    }
                    return sum;
                }
            });
        }

        System.out.println("[Check finished process]");

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("[Result] : "+value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        executorService.shutdown();

        if (executorService.isShutdown()) {
            System.out.println("shutdown");
        }

    }
}

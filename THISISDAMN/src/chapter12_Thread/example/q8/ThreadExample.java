package chapter12_Thread.example.q8;

public class ThreadExample {

    public static void main(String[] args) {

        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        thread.interrupt();
    }
}

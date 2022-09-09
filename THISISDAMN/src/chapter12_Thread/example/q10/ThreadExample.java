package chapter12_Thread.example.q10;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        //if the main thread shutdown, wanna make the moviethread shuts as well.
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

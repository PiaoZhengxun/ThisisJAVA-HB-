package chapter12_Thread.example.q8;

public class MovieThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Play the Movie");
            if (this.isInterrupted()) {
                System.out.println("break; code worked");
                break;
            }
        }
    }
}

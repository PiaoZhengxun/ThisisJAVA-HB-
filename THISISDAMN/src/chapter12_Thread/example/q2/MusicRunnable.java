package chapter12_Thread.example.q2;

public class MusicRunnable implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Play the Music");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

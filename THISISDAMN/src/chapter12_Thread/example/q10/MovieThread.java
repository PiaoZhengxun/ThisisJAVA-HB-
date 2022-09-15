package chapter12_Thread.example.q10;

public class MovieThread extends Thread {
    @Override
    public void run(){
        while (true){
            System.out.println("play the movie");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

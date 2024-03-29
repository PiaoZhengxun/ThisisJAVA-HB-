package chapter12_Thread.yield;

public class YieldExample {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadA.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){

        }
        threadA.work = true;

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e){

        }
        threadA.stop = true;
        threadB.stop = true;
    }
}

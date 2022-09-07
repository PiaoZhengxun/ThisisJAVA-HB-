package partTwo.c12.waitNotify;

public class WorkObject {

    public synchronized void methodA(){
        System.out.println("MethodA의 method A 작업 실행");
        notify();
        try {
            wait();
        } catch(InterruptedException e){

        }
    }

    public synchronized void methodB(){
        System.out.println("MethodB의 method B 작업 실행");
        notify();
        try {
            wait();
        } catch(InterruptedException e){

        }
    }
}

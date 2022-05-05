package partTwo.c12.threadGroup;

public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup tg, String tn) {
		super(tg, tn);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName()+ " closed");
	}

}

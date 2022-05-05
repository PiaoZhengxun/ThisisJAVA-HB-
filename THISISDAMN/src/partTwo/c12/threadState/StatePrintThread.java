package partTwo.c12.threadState;

public class StatePrintThread extends Thread {
	
	private Thread tT;
	
	public StatePrintThread(Thread tT) {
		this.tT = tT;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = tT.getState();
			System.out.println("State of Thread :"+state);
			
			if(state == Thread.State.NEW) {
				tT.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

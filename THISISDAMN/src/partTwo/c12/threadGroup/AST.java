package partTwo.c12.threadGroup;

public class AST extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

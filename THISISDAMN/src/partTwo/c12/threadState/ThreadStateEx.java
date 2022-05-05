package partTwo.c12.threadState;

public class ThreadStateEx {
	
	public static void main(String[] args) {
		
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		
		spt.start();
	}

}

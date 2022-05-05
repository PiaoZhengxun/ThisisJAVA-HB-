package partTwo.c12;

public class PriorityEx {

	public static void main(String[] args) {
		for(int i = 0; i < 12; i++) {
			Thread td = new CalcThread("Thread" + i);
			if(i != 10) {
				td.setPriority(Thread.MIN_PRIORITY);
			} else {
				td.setPriority(Thread.MAX_PRIORITY);
			}
			td.start();
		}
		

	}

}

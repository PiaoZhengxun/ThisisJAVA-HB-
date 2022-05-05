package partTwo.c12;

public class CalcThread extends Thread {
	
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2000000000; i ++) {
			for(int j=0; j < 20000000; j++) {
				
			}
		}
		
		System.out.println(getName());
	}

}

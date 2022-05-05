package partTwo.c12.multiConcern;

public class User1 extends Thread {

	private Calculator calc;
	
	public void setCalculator(Calculator calc) {
		this.setName("user1");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
	}
}

package chapter12_Thread.multiConcern;

public class User2 extends Thread {

	private Calculator calc;

	public void setCalculator(Calculator calc) {
		this.setName("user2");
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory(50);
	}

}

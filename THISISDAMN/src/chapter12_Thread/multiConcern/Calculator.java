package chapter12_Thread.multiConcern;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName());
			e.printStackTrace();
			System.out.println(this.memory);
		}
		System.out.println(Thread.currentThread().getName() + ";" + this.memory);
	}

}

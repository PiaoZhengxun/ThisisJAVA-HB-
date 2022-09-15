package c6.exc;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	private int aa;
	
	static Singleton getInstance() {
		return singleton;
	}

}

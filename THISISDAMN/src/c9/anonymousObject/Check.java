package c9.anonymousObject;

public class Check {
	
	
	
	public static void main(String[] args) {
		
		Anonymous an = new Anonymous();
		an.method(0, 0);
		
		Self s = new Self();
		Self.B b = new Self.B();
		Self.A a = s.new A();
	}

}

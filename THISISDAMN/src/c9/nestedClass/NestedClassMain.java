package c9.nestedClass;

public class NestedClassMain {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		A.C c = new A.C();
		
		a.method();

	}

}

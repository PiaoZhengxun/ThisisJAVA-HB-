package c9.nestedClass;

public class A {
	
	public A() {
		System.out.println("AAAAA");
	}
	
	class B {
		B() {
			System.out.println("BB");
		}
	}
	
	static class C {
		C() {
			System.out.println("CC");
		}
	}
	
	void method() {
		class D {
			D () {
				System.out.println("DD");
			}
		}
		D d = new D();
		
	}
	

}

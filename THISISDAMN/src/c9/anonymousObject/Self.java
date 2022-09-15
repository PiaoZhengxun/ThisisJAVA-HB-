package c9.anonymousObject;

public class Self {
	
	public Self() {
		System.out.println("self");
	}
	
	public class A {
		A (){
			System.out.println("a");
		}
	}

	public static class B {
		B () {
			System.out.println("b");
		}
	}

}

package c6.annotationCheck;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("e1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("e12");
	}

	@PrintAnnotation(value="#", count=20)
	public void method3() {
		System.out.println("e123");
	}

}

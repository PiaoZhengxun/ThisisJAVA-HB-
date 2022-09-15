package c11.objClass;

public class Car {
	
	String tmi = "필드";
	
	public Car() {
		System.out.println("생성자");
	}
	
	public void method() {
		System.out.println("메소드");
	}
	
	
	private void method1() {
		System.out.println("메메소소드드");
	}

	public String getTmi() {
		return tmi;
	}

	public void setTmi(String tmi) {
		this.tmi = tmi;
	}

}

package c11.objClass;

public class Car {
	
	String tmi = "�ʵ�";
	
	public Car() {
		System.out.println("������");
	}
	
	public void method() {
		System.out.println("�޼ҵ�");
	}
	
	
	private void method1() {
		System.out.println("�޸޼Ҽҵ��");
	}

	public String getTmi() {
		return tmi;
	}

	public void setTmi(String tmi) {
		this.tmi = tmi;
	}

}

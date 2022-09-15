package c11.object;

public class S {
	
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		
		if(o1 == o2) {
			System.out.println("o1 == o2");
		} else {
			System.out.println("o1 != o2");
		}
		
		if(o1.equals(o2)) {
			System.out.println("equals ok");
		} else {
			System.out.println("equals not ok");
		}
		
		
		Object o3 = new Object();
		System.out.println(o3.toString());
		
	}

}

package c11.toString;

import java.util.Date;

public class Example {
	
	public static void main(String[] args) {
		Object o1 = new Object();
		Date o2 = new Date();
		
		while(true) {
			System.out.println(o1);
			System.out.println(o2.toString());
		}
		
		
	}

}

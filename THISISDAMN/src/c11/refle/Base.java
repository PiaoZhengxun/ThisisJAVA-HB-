package c11.refle;

import java.lang.reflect.Constructor;

public class Base {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class checkC = Class.forName("c11.refle.Check");
		
		Constructor[] cons = checkC.getDeclaredConstructors();
		for(Constructor con : cons) {
			System.out.print(con.getName() + "(1");
			Class[] params = con.getParameterTypes();
			printParam(params);
			System.out.println(")3");
		}
	}

	private static void printParam(Class[] params) {
		for(int i = 0; i < params.length; i++) {
			System.out.print(params[i].getSimpleName());
			if(i<params.length-1) {
				System.out.print("4");
			}
		}
		
	}

}

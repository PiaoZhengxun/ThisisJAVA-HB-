package c11.objClass;

public class CHekc {
	
	
	public static void main(String[] args) {
		Car car = new Car();
		
		Class cl1 = car.getClass();
		System.out.println(cl1.getClass());
		System.out.println(cl1.getName());
		System.out.println(cl1.getSimpleName());
		System.out.println(cl1.getPackageName());
		System.out.println(cl1.getPackage().getName());
		System.out.println();
		
		try {
			Class cl2 = Class.forName("c11.objClass.Car");
			System.out.println(cl2.getName());
			System.out.println(cl2.getSimpleName());
			System.out.println(cl2.getPackageName());
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

package c9;

public class Exam04NestedClass {
	
	public static void main(String[] args) {
		
		Exam04Car car = new Exam04Car();
		
		Exam04Car.Tire tire = car.new Tire();
		Exam04Car.Engine en = new Exam04Car.Engine();
	}

}

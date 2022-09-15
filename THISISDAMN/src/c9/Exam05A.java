package c9;

public class Exam05A {
	
	Exam05V field = new Exam05V(){

		@Override
		public void run() {
			System.out.println("field");

		}
		
	};
	
	void method1() {
		Exam05V lv = new Exam05V() {
			@Override
			public void run() {
				System.out.println("method-run");
			}
		};
		
		lv.run();
	}
	
	void method2(Exam05V exam05V) {
		exam05V.run();
	}
	

	
}

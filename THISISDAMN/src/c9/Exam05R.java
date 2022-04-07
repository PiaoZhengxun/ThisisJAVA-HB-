package c9;

public class Exam05R {
	
	public static void main(String[] args) {
		
		Exam05A ea = new Exam05A();
		
		ea.field.run();
		
		ea.method1();
		
		ea.method2(new Exam05V() {

			@Override
			public void run() {
				System.out.println("newnew");
				
			}
			
		});
	}

}

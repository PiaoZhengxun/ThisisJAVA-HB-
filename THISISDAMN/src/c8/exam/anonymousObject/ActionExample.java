package c8.exam.anonymousObject;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("������");
			}
		};
		
		action.work();

	}

}

package c10.exception;

public class Calc {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.deposit(10000);
		System.out.println("µ·"+a.getB());
		
		try {
			a.withdraw(20000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
			System.out.println("==============");
			e.printStackTrace();
		}
	}

}

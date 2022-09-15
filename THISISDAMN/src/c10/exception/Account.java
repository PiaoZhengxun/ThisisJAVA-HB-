package c10.exception;

public class Account {
	
	private long b;
	
	public Account() {
		
	}

	public long getB() {
		return b;
	}
	
	public void deposit(int money) {
		b += money;
	}
	
	public void withdraw(int money) throws BalanceException {
		if(b < money) {
			throw new BalanceException("ÀÜ°íºÎÁ· ¤¼¤¼"+(money-b)+ "¤·¤»?");
		}
		b -= money;
	}
	
	

}

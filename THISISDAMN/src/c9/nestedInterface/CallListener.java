package c9.nestedInterface;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("call");
		
	}

}

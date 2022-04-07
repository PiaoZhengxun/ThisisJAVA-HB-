package c9.nestedInterface;

public class ButtonExample {
	
	public static void main(String[] args) {
		
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MsgListener());
		btn.touch();
	}

}

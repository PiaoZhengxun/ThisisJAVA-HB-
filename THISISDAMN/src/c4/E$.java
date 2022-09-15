package c4;

public class E$ {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		do {
			a = (int)(Math.random()*6 +1);
			b = (int)(Math.random()*6 +1);
			
			System.out.println(a + " " + b);	
		}while(a+b != 5);
		
		
	}

}

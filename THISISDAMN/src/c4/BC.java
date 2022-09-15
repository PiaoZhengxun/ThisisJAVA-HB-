package c4;

public class BC {
	
	public static void main(String[] args) {
		Outter: for(int i = 1; i <= 100; i++) {
			for(int a = 1; a <= 100; a++) {
				System.out.println(a);	
				if(a==5) {
					break Outter;
				}
			}
		}
	}

}

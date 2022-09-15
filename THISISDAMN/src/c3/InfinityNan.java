package c3;

import java.io.IOException;

public class InfinityNan {
	
	public static void main(String[] args) throws IOException {
		
		int x = 5;
		double y = 0.0;
		
		double z = x% y ;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2);
	}

}

package c5;

public class E7 {
	
	public static void main(String[] args) {
		int max =0;
		int[] arr = { 1, 5, 3, 8, 2};
		
		for(int maxx : arr) {
			if(max < maxx) {
				max = maxx;
			}
		}
		
		System.out.println("max " + " = " + max);
	}

}

package c11.self;

public class InfiniteMakingObjects {
	
	public static void main(String[] args) {
		
		int i = 0;
		while(true) {
			i += 1;
			String name = "ex" + i;
			ExampleClass ex = new ExampleClass(i);
			int a = ex.hashCode();
			System.out.println(name + "  ///  "+a);			
		}
	}

}

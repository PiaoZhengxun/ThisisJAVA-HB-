package c9.anonymousObject;

public class Anonymous {
	
	
	private int field;

	


	public void method(final int a1, int a2) {
		final int var1 =0;
		int var2 = 0;

		field = 10;

		Calculate calc = new Calculate() {

			@Override
			public int sum() {
				int result = field + a1 + a2 + var1 + var2;
				return result;
			}

		};

		System.out.println(calc.sum());
	}

}

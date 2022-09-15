package c6.exam;

public class Printer {
	
	static int a;
	static boolean b;
	static double c;
	static String d;
	
	static int println(int a) {
		System.out.println(a);
		return a;
	}
	
	static boolean println(boolean b) {
		System.out.println(b);
		return b;
	}

	static double println(double c) {
		System.out.println(c);
		return c;
	}
	
	static String println(String msg) {
		System.out.println(msg);
		return msg;
	}

}

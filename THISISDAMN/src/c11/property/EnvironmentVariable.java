package c11.property;

public class EnvironmentVariable {
	
	public static void main(String[] args) {
		String ja = System.getenv("JAVA_HOME");
		System.out.println(ja);
	}

}

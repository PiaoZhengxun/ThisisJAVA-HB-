package c11.e;

import java.util.regex.Pattern;

public class PME {
	
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9] {8,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}

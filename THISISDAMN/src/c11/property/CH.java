package c11.property;

import java.util.Properties;
import java.util.Set;

public class CH {
	
	public static void main(String[] args) {
		
		String a = System.getProperty("user.name");
		String b = System.getProperty("user.dir");
		String c = System.getProperty("java.version");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------------");
		System.out.println();
		System.out.println("--------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object obj: keys) {
			String key = (String) obj;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] = " + value);
		}
	}

}

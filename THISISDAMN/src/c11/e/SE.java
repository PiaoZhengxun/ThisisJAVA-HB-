package c11.e;

import java.util.StringTokenizer;

public class SE {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		String[] splitS = str.split(",");
		
		for(int i = 0; i < splitS.length; i++) {
			System.out.println(splitS[i]);
		}
		
		StringTokenizer st = new StringTokenizer(str, ",");
		int count = st.countTokens();
		
		for(int i = 0; i < count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}

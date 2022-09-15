package c6.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("login");
			memberService.logout("hong");
		} else {
			System.out.println("nono");
		}
		

	}

}

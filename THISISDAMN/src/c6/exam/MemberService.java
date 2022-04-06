package c6.exam;

public class MemberService {
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}		
	}
	
	public String logout(String msg) {
		System.out.println("ok logout");
		return msg;
	}
	

}

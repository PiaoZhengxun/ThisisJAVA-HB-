package c10.exception.exam.q7;

public class Login {

	public static void main(String[] args) {
		
		
		
		
		try {
			login("blue", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		a();
		b();
	
		
	}
	
	public static void a() {
		try {
			login("ww", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void b() {
		try {
			login("blue", "11");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		
		if(!id.equals("blue")) {
			throw new NotExistIDException("���� �Ƶ� �߸��ƴ�");
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("��. ����߸�ħ�� ��?");
		}
		
		
		System.out.println("���� �� ��ħ");
	}

}

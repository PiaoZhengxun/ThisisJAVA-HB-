package c6.exam;

public class ShopServiceExam {

	public static void main(String[] args) {
		
		ShopService ss1 = ShopService.getInstance();
		ShopService ss2 = ShopService.getInstance();
		
		if(ss1 == ss2) {
			System.out.println("okok");
		}

	}

}

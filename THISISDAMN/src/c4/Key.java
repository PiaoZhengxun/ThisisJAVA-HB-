package c4;

import java.util.Scanner;

public class Key {
	
	public static void main(String[] args) throws Exception {
		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int abc = sc.nextInt();
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("-----------------------------");
				System.out.print("����: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) { //1
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 50) { //2
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 51) { //3
				run = false;
			}
		}	
		
		System.out.println("���α׷� ����");
	}


}

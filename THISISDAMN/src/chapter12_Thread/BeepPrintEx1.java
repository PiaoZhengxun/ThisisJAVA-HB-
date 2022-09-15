package chapter12_Thread;

import java.awt.Toolkit;

public class BeepPrintEx1 {

	public static void main(String[] args) {

		//		Runnable bt = new BeepTask();
		//		
		//		Thread t1 = new Thread(bt);
		//		t1.start();

//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit tk = Toolkit.getDefaultToolkit();
//
//				for(int i = 0; i < 5; i++) {
//					tk.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//						System.out.println(e);
//					}
//				}
//			}
//		});
		
		Thread t1 = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			
			for(int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		
		t1.start();

		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}

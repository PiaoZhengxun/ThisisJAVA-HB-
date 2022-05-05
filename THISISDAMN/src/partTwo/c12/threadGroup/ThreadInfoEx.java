package partTwo.c12.threadGroup;

import java.util.Map;
import java.util.Set;

public class ThreadInfoEx {

	public static void main(String[] args) {
		AST ast = new AST();
		ast.setName("AST");
		ast.setDaemon(true);
		ast.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) {
			System.out.println("name : " + thread.getName() + ((thread.isDaemon()?"daemon":"main")));
			try {
				System.out.println("\t" + "belong(group Name) :" + thread.getThreadGroup().getName());
				System.out.println();
			} catch(NullPointerException e) {
				e.printStackTrace();
				System.out.println(e);
			}
			
			
		}

	}

}

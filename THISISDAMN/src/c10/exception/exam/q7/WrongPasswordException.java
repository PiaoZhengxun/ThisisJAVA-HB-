package c10.exception.exam.q7;

public class WrongPasswordException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}

}

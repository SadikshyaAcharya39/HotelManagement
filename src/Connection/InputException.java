package Connection;

public class InputException extends Exception{
	private static final long serialversionUID =1L;
	public InputException() {
		super ("The data you entered is not correct. Please check the input");
	}
	public InputException(String message) {
		super(message);
		
	}
}
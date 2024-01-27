package custom_exception;

public class PublicationException extends Exception{

	private static final long serialVersionUID = 1L;

	public PublicationException(String message) {
		super(message);
	}
	
}

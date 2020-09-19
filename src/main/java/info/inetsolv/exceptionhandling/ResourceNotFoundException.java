package info.inetsolv.exceptionhandling;

public class ResourceNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1203563879923942569L;

	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(final String msg) {
		super(msg);
	}
}


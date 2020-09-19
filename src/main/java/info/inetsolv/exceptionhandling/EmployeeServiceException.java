package info.inetsolv.exceptionhandling;

public class EmployeeServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6852430253936936373L;
	
	public EmployeeServiceException() {
		super();	
	}
	
	public EmployeeServiceException(final String msg) {
		super(msg);
	}
}
	
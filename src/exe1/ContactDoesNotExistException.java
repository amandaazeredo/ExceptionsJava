package exe1;

public class ContactDoesNotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contactName;
	
	public ContactDoesNotExistException(String contactName) {
		this.contactName = contactName;
	}
	
	@Override
	public String getMessage() {
		return "Contact " + contactName + " Does Not Exist in Schedule.";
	}
}

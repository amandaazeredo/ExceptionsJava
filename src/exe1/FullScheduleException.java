package exe1;

public class FullScheduleException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1141846812840957136L;

	@Override
	public String getMessage() {
		return "Schedule is already full";
	}
}

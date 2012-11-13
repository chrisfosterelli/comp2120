/* COMP2120 Seminar 8 Assignment
 * MonthException.java - Exception definition for incorrect month
 * Christopher Foster
 * Novermber 12, 2012 */

public class MonthException extends NumberFormatException {
	public MonthException() {
		super("Month is not between 1 and 12");
	}

	public MonthException(int month) {
		super("The month " + month + " is not between 1 and 12");
	}

	public MonthException(String msg) {
		super(msg);
	}
}

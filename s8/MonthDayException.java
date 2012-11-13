/* COMP2120 Seminar 8 Assignment
 * MonthDayException.java - Exception definition for incorrect days in specified month
 * Christopher Foster
 * Novermber 12, 2012 */

public class MonthDayException extends NumberFormatException {
	public MonthDayException() {
		super("Invalid number of days in the specified month");
	}

	public MonthDayException(String month, int days) {
		super("There are not " + days + " days in " + month);
	}

	public MonthDayException(String msg) {
		super(msg);
	}
}

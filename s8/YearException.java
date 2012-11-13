/* COMP2120 Seminar 8 Assignment
 * YearException.java - Exception definition for incorrect year
 * Christopher Foster
 * Novermber 12, 2012 */

public class YearException extends NumberFormatException {
	public YearException() {
		super("Year is not between 1900 and 2012");
	}

	public YearException(int year) {
		super("The year " + year + " is not between 1900 and 2012");
	}

	public YearException(String msg) {
		super(msg);
	}
}

/* COMP2120 Seminar 8 Assignment
 * SlashException.java - Exception definition for incorrect number of separators
 * Christopher Foster
 * Novermber 12, 2012 */

public class SlashException extends NumberFormatException {
	public SlashException() {
		super("Exactly two slashes are required");
	}

	public SlashException(String msg) {
		super(msg);
	}
}

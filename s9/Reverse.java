/* COMP2120 Seminar 9 Assignment
 * Reverse.java - Reverse a given string
 * Christopher Foster
 * November 19, 2012 */

public class Reverse {
	public static String reverse(String message) {
		if (message.length() == 1 ||
		    message.length() == 0) {
			// Base case
			return message;
		} else {
			// Recursive case
			return message.substring(message.length()-1) + 
			       reverse(message.substring(1, message.length()-1)) +
			       message.substring(0, 1);
		}
	}
}

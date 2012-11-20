/* COMP2120 Seminar 9 Assignment
 * ReverseDriver.java - Driver file for the Reverse recursive computation
 * Christopher Foster
 * November 19, 2012 */

public class ReverseDriver {
	public static void main(String args[]) {

		// Create our test data
		String[] dataset = {
			"book",  		// Answer: "koob"
			"hello", 		// Answer: "olleh"
			"example", 		// Answer: "elpmaxe"
			"Welcome!", 		// Answer: "!emocleW"
			"How are you?"  	// Answer: "?uoy era woH"
		};

		System.out.println("Computing reverse of test data... ");

		for (int i = 0; i != dataset.length; i++) {
			System.out.print("\tTest dataset " + (i+1) + ": ");
			System.out.println(Reverse.reverse(dataset[i]));
		}

	}
}

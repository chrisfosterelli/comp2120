/* COMP2120 Seminar 9 Assignment
 * LargestDriver.java - Driver file for the Largest recursive computation
 * Christopher Foster
 * November 19, 2012 */

public class LargestDriver {
	public static void main(String args[]) {
		
		// Create our test data
		int[][] datasets = {
			{ 10, 14 }, 			// Answer: 14
			{ 12390123 }, 			// Answer: 12390123
			{ 9213, 3187, 1230 }, 		// Answer: 9213
			{ 1, 2, 3, 4, 5, 6 },  		// Answer: 6
			{ 8, 1, 4, 1, 9, 8 } 		// Answer: 9
		};

		System.out.println("Computing largest int of test data... ");

		for(int i = 0; i != datasets.length; i++) {
			System.out.print("\tTest dataset " + (i+1) + ": ");
			System.out.println(Largest.largest(datasets[i]));
		}

	}
}

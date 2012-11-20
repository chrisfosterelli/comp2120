/* COMP2120 Seminar 9 Assignment
 * Largest.java - Find the largest integer in an array
 * Christopher Foster
 * November 19, 2012 */

import java.util.Arrays;

public class Largest {
	public static int largest(int[] array) {
		if (array.length == 1) {
			// Base case
			return array[0];
		} else {
			// Recursive case
			if (array[0] > array[1]) array[1] = array[0];
			return largest(Arrays.copyOfRange(array, 1, array.length));
		}
	}
}

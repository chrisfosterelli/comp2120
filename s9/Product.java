/* COMP2120 Seminar 9 Assignment
 * Product.java - Compute the product of all values in an array of integers
 * Christopher Foster
 * November 19, 2012 */

import java.util.Arrays;

public class Product {
	public static int product(int[] array) {
		if (array.length == 1) {
			// Base case
			return array[0];
		} else {
			// Recursive case
			return array[0] * product(Arrays.copyOfRange(array, 1, array.length));
		}
	}
}

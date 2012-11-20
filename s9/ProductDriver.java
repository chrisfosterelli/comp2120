/* COMP2120 Seminar 9 Assignment
 * ProductDriver.java - Driver file for the Product recursive computation
 * Christopher Foster
 * November 19, 2012 */

public class ProductDriver {
	public static void main(String args[]) {
	
		// Create our test data
		int[][] datasets = {
			{ 12 }, 			// Answer: 12
			{ 84, 18, 109 }, 		// Answer: 164808
			{ 1, 3, 4, 8, 19 }, 		// Answer: 1824
			{ 8, 1, 4, 2, 81 }, 		// Answer: 5184
			{ 91093, 1223, 2 } 		// Answer: 222813478
		};

		System.out.println("Computing products of test data... ");

		for(int i = 0; i != datasets.length; i++) {
			System.out.print("\tTest dataset " + (i+1) + ": ");
			System.out.println(Product.product(datasets[i]));
		}

	}
}

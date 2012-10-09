/* COMP2120 Seminar 3 Assignment
 * LaywerDriver.java - Lawyer Driver Class
 * Christopher Foster
 * October 2, 2012 */

public class LawyerDriver {
	public static void main(String args[]) {
		/* Create some lawyers */
		Lawyer testLawyer1 = new Lawyer();
		Lawyer testLawyer2 = new Lawyer("Christopher", "Foster",
						"Corporate Law", 24.3);

		/* Demonstrate toString of Lawyer() */
		System.out.println("\nDemonstrating toString()");

		System.out.println("\nLawyer 1:");
		System.out.println(testLawyer1);

		System.out.println("\nLawyer 2:");
		System.out.println(testLawyer2);

		/* Demonstrate mutators */
		System.out.println("\nDemonstrating mutators");

		testLawyer1.setRate(27.8);
		testLawyer1.setName("Aaron", "Foster");
		testLawyer1.setPractice("Personal Injury");

		System.out.println("\nLawyer 1:");
		System.out.println(testLawyer1);

		/* Demonstrate accessors */
		System.out.println("\nDemonstrating accessors");

		System.out.print("Lawyer 1 Name: ");
		System.out.println(testLawyer1.getName());

		System.out.print("Lawyer 1 Practice: ");
		System.out.println(testLawyer1.getPractice());

		System.out.print("Lawyer 1 Rate: ");
		System.out.println(testLawyer1.getRate());

		/* Demonstrate equals method */
		System.out.println("\nDemonstrating equals()");

		if (testLawyer1.equals(testLawyer2)) {
			System.out.println("Lawyer 1 and Lawyer 2 are equal");
		} else {
			System.out.println("Lawyer 1 and Lawyer 2 are not equal");
		}

		testLawyer2.setRate(27.8);
		testLawyer2.setName("Aaron", "Foster");
		testLawyer2.setPractice("Personal Injury");

		if (testLawyer1.equals(testLawyer2)) {
			System.out.println("Lawyer 1 and Lawyer 2 are now equal");
		} else {
			System.out.println("Lawyer 1 and Lawyer 2 are still not equal");
		}

		/* Demonstrate paycheck calculation */
		System.out.println("\nDemonstrating paycheck calculate");

		System.out.print("Pay for 14 hours for Lawyer 1: ");
		System.out.println(testLawyer1.calcPayCheck(14));

		System.out.print("Pay for 27 hours for Lawyer 1: ");
		System.out.println(testLawyer1.calcPayCheck(27));

		System.out.println("\nOutput done.");
	}
}

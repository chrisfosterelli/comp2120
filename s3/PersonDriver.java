/* COMP2120 Seminar 3 Assignment
 * PersonDriver.java - Person Class Driver
 * Christopher Foster
 * October 2, 2012 */

public class PersonDriver {

	public static void main(String args[]) {
		/* Create some people */
		Person testPerson1 = new Person();
		Person testPerson2 = new Person("Christopher", "Foster");

		/* Demonstrate toString of Person() */
		System.out.println("\nDemonstrating toString()");

		System.out.print("Person 1: ");
		System.out.println(testPerson1);

		System.out.print("Person 2: ");
		System.out.println(testPerson2);

		/* Demonstrate mutators */
		System.out.println("\nDemonstrating mutators");

		testPerson1.setFirstName("Aaron");
		testPerson1.setLastName("Foster");
		System.out.print("Person 1: ");
		System.out.println(testPerson1);

		/* Demonstrate accessors */
		System.out.println("\nDemonstrating accessors");

		System.out.print("Person 1 First Name: ");
		System.out.println(testPerson1.getFirstName());

		System.out.print("Person 1 Last Name: ");
		System.out.println(testPerson1.getLastName());

		/* Demonstrate equals method */
		System.out.println("\nDemonstrating equals()");

		if (testPerson1.equals(testPerson2)) {
			System.out.println("Person 1 and Person 2 are equal");
		} else {
			System.out.println("Person 1 and Person 2 are not equal");
		}

		testPerson2.setFirstName("Aaron");

		if (testPerson1.equals(testPerson2)) {
			System.out.println("Person 1 and Person 2 are now equal");
		} else {
			System.out.println("Person 1 and Person 2 are still not equal");
		}

		System.out.println("\nOutput done.");
	}

}

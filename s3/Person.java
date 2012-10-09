/* COMP2120 Seminar 3 Assignment
 * Person.java - Person class
 * Christopher Foster
 * October 2, 2012 */

public class Person {

	/* Instance variables */
	private String firstName;
	private String lastName;

	/* Constructors */
	public Person() {
		this.firstName = new String("N/A");
		this.lastName = new String("N/A");
	}

	public Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	/* Mutators */
	public void setFirstName(String first) {
		this.firstName = first;
	}

	public void setLastName(String last) {
		this.lastName = last;
	}

	/* Accessors */
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/* Typical methods */
	public String toString() {
		return this.lastName + ", " + this.firstName;
	}

	public boolean equals(Person opt) {
		// Return the toString() of both Person()s
		// and then use the String() class's equals() to compare them
		return (opt.toString().equals(this.toString()));
	}
}

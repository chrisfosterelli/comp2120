/* COMP2120 Seminar 7 Assignment
 * Snake.java - Snake class that implements Animal and Comparable
 * Christopher Foster
 * November 5, 2012 */

public class Snake implements Animal, Comparable {

	/* Instance variable */
	private double length;

	/* Constructors */
	public Snake() {
		this.setLength(0);
	}

	public Snake(double length) {
		this.setLength(length);
	}

	/* Mutator */
	public void setLength(double length) {
		this.length = length;
	}

	/* Accessor */
	public double getLength() {
		return this.length;
	}

	/* Implement Animal interface */
	public void movement() {
		System.out.println("The snake slithers silently.");
	}

	public void sound() {
		System.out.println("The snake hisses dangerously.");
	}

	/* Implement Comparable interface */
	public int compareTo(Object o) {
		return (int)(this.getLength() - ((Snake)o).getLength());
	}

	/* toString() */
	public String toString() {
		return "Snake object";
	}

}

/* COMP2120 Seminar 7 Assignment
 * Hawk.java - Hawk class that implements Animal and Comparable
 * Christopher Foster
 * November 5, 2012 */

public class Hawk implements Animal, Comparable {

	/* Instance variable */
	private double wingspan;

	/* Constructors */
	public Hawk() {
		this.setWingspan(0);
	}

	public Hawk(double wingspan) {
		this.setWingspan(wingspan);
	}

	/* Mutator */
	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	/* Accessor */
	public double getWingspan() {
		return this.wingspan;
	}

	/* Implement Animal interface */
	public void movement() {
		System.out.println("The hawk flies gracefully.");
	}

	public void sound() {
		System.out.println("The hawk shrieks piercingly");
	}

	/* Implement Comparable interface */
	public int compareTo(Object o) {
		return (int)(this.getWingspan() - ((Hawk)o).getWingspan());
	}

	/* toString() */
	public String toString() {
		return "Hawk object";
	}

}

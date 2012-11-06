/* COMP2120 Seminar 7 Assignment
 * Elephant.java - Elephant class that implements Animal and Comparable
 * Christopher Foster
 * November 5, 2012 */

public class Elephant implements Animal, Comparable {

	/* Instance variable */
	private double weight;

	/* Constructor */
	public Elephant() {
		this.setWeight(0);
	}

	public Elephant(double weight) {
		this.setWeight(weight);
	}
	
	/* Mutator */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/* Accessor */
	public double getWeight() {
		return this.weight;
	}

	/* Implement Animal interface */
	public void movement() {
		System.out.println("The elephant slowly walks.");
	}

	public void sound() {
		System.out.println("The elephant trumpets loudly.");
	}

	/* Implement Comparable interface */
	public int compareTo(Object o) {
		return (int)(this.getWeight() - ((Elephant)o).getWeight());
	}

}

/* COMP2120 Seminar 7 Assignment
 * Zoo.java - Zoo class that implements Iterator
 * Christopher Foster
 * November 5, 2012 */

import java.util.Iterator;

public class Zoo implements Iterator {

	/* Instance variables */
	private Animal[] zoo;
	int count = 0;

	/* Constructors */
	public Zoo() {
		this.zoo = null;
	}

	public Zoo(Animal[] zoo) {
		this.zoo = zoo;
	}

	/* For debugging */
	public void printState() {
		for(Animal animal : this.zoo) {
			System.out.println(animal);
		}
	}

	/* Implement Iterator interface */
	public boolean hasNext() {
		return (this.count < this.zoo.length);
	}

	public Animal next() {
		return this.zoo[this.count++];
	}

	public void remove() {
		this.zoo[this.count-1] = null;
		for (int z = this.count ; z < this.zoo.length; z++) {
			this.zoo[z-1] = this.zoo[z];
		}

		this.zoo[this.zoo.length-1] = null;
	}

}

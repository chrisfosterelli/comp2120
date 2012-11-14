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
		Animal[] newZoo;
		newZoo = new Animal[this.zoo.length-1];
		
		// Copy over the array
		for (int z = 0; z < this.zoo.length-1; z++) {
			if (z > this.count-2) {
				newZoo[z] = this.zoo[z+1];	
			} else {
				newZoo[z] = this.zoo[z];	
			}

		}

		this.zoo = newZoo;
		this.count--;
	}

}

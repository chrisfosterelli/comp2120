/* COMP2120 Seminar 7 Assignment
 * Driver.java - Driver class to test all other classes
 * Christopher Foster
 * November 5, 2012 */

public class Driver {
	public static void main(String args[]) {
		Animal[] animals = {
			new Elephant(7482.33),
			new Elephant(7319.23),
			new Snake(8.322),
			new Snake(8.501),
			new Hawk(14.2),
			new Hawk(13.1)
		};

		// Comparing types
		System.out.print("\nComparing Elephants: ");
		if (((Elephant)animals[0]).compareTo(animals[1]) > 0) {
			System.out.println("Animal 1 weighs more.");
		} else {
			System.out.println("Animal 2 weighs more.");
		}

		System.out.print("\nComparing Snakes: ");
		if (((Snake)animals[2]).compareTo(animals[3]) > 0) {
			System.out.println("Animal 3 is longer.");
		} else {
			System.out.println("Animal 4 is longer.");
		}

		System.out.print("\nComparing Hawks: ");
		if (((Hawk)animals[4]).compareTo(animals[5]) > 0) {
			System.out.println("Animal 5 has longer wings.");
		} else {
			System.out.println("Animal 6 has longer wings.");
		}
		
		// Iterate over
		System.out.println("\nDemonstrating sounds and movement:");
		for (Animal animal : animals) {
			animal.sound();
			animal.movement();
		}

		// Create zoo
		Zoo zoo = new Zoo(animals);
		System.out.println("\nCurrent state of zoo: ");
		zoo.printState();

		// Demonstrate item removal
		System.out.println("\nRemoving the first element.");
		System.out.println("Current state of zoo: ");
		zoo.next(); zoo.remove();
		zoo.printState();

		// Demonstrate iterator capabilities
		System.out.println("\nDemonstrating hasNext() and next() over the rest of the array");
		while (zoo.hasNext()) {
			System.out.println(zoo.next());
		}

	}
}

/* COMP2120 Seminar 6 Assignment
 * Driver.java - Driver for the Electronic sub-classes
 * Christopher Foster
 * October 29, 2012 */

public class Driver {

	/* Main method */
	public static void main(String args[]) {

		// Create our array of elctronics
		Electronic[] electronics = {
			new Phone("Nokia", "1161", 0.999, 3.0, 49.99, "2503761393"),
			new Phone("Alcatel", "1195A", 1.57, 3.0, 29.99, "2503761222"),
			new SmartPhone("Samsung", "S3", 0.112, 3.0, 599.99, "2505727988", 0),
			new SmartPhone("Apple", "Iphone 5", 0.101, 4.1, 699.99, "2505728123", 15),
			new SatellitePhone("Iridium", "9900", 0.26, 5.0, 1395.99, "18728238999", false),
			new SatellitePhone("Globalstar", "Ab3", 0.572, 12.0, 499.99, "18738889123", true),
			new Television("Panasonic", "32\" VIERA", 10.0, 200, 249.99, 15),
			new Television("Samsung", "75\" Smart TV", 49.7, 125, 9999.99, 13),
			new Electronic(), new Electronic() // We don't know what type of electronics these are
		};

		// Demonstrate the Electronic class
		System.out.println("\n================= Electronic Class ===================");
		System.out.print("\nPower status of electronic 9: ");
		System.out.println(electronics[8].isOn());
		
		System.out.println("\nChanging power states");
		electronics[8].turnOn();

		System.out.print("Power status of electronic 9: ");
		System.out.println(electronics[8].isOn());

		System.out.println("\nChanging power states");
		electronics[8].turnOff();

		System.out.print("Power status of electronic 9: ");
		System.out.println(electronics[8].isOn());

		// Demonstrate the Phone class
		System.out.println("\n================= Phone Class ===================");
		System.out.println("\nCalling phone 250-572-8888 with electronic 1: ");
		((Phone)electronics[0]).call("2505728888");

		System.out.println("\nTurning phone on.");
		electronics[0].turnOn();

		System.out.println("\nCalling phone 250-572-8888 with electronic 1: ");
		((Phone)electronics[0]).call("2505728888");

		// Demonstrate the SmartPhone class
		System.out.println("\n================= SmartPhone Class ===================");
		System.out.print("\nApp count of electronic 3: ");
		System.out.println(((SmartPhone)electronics[2]).getAppcount());

		System.out.println("\nInstalling application: ");
		((SmartPhone)electronics[2]).installApp();

		System.out.print("\nApp count of electronic 3: ");
		System.out.println(((SmartPhone)electronics[2]).getAppcount());

		System.out.println("\nTurning smartphone on.");
		electronics[2].turnOn();

		System.out.println("\nInstalling application: ");
		((SmartPhone)electronics[2]).installApp();

		System.out.print("\nApp count of electronic 3: ");
		System.out.println(((SmartPhone)electronics[2]).getAppcount());

		System.out.println("\nUninstalling application: ");
		((SmartPhone)electronics[2]).uninstallApp();

		System.out.print("\nApp count of electronic 3: ");
		System.out.println(((SmartPhone)electronics[2]).getAppcount());

		// Demonstrate the SatellitePhone class
		System.out.println("\n================= SatellitePhone Class ===================");

		System.out.println("\nTurning Satellitephone on.");
		electronics[4].turnOn();

		System.out.println("\nCalling phone 250-572-8888 with electronic 5: ");
		((SatellitePhone)electronics[4]).call("2505728888"); // Technically we could just cast Phone

		System.out.println("\nConnecting electronic 3 to satellite: ");
		((SatellitePhone)electronics[4]).connect();

		System.out.println("\nCalling phone 250-572-8888 with electronic 5: ");
		((SatellitePhone)electronics[4]).call("2505728888"); // Technically we could just cast Phone

		System.out.println("\nDisconnecting electronic 3 from satellite: ");
		((SatellitePhone)electronics[4]).disconnect();

		// Demonstrate Television class
		System.out.println("\n================= Television Class ===================");

		System.out.print("\nCurrent channel for electronic 7: ");
		System.out.println(((Television)electronics[6]).getChannel());

		System.out.println("\nHitting channel up button: ");
		((Television)electronics[6]).channelUp();

		System.out.print("\nCurrent channel for electronic 7: ");
		System.out.println(((Television)electronics[6]).getChannel());

		System.out.println("\nTurning television on.");
		electronics[6].turnOn();

		System.out.println("\nHitting channel up button: ");
		((Television)electronics[6]).channelUp();

		System.out.print("\nCurrent channel for electronic 7: ");
		System.out.println(((Television)electronics[6]).getChannel());

		System.out.println("\nHitting channel down button: ");
		((Television)electronics[6]).channelDown();

		System.out.print("\nCurrent channel for electronic 7: ");
		System.out.println(((Television)electronics[6]).getChannel());
		

		// Determine the most costly item
		// Utilizes polymorphism
		System.out.println("\n================= Electronics List ===================");
		Electronic most_costly = electronics[0];
		for (Electronic current : electronics) {
			System.out.println("\n" + current);
			if (current.getCost() > most_costly.getCost()) {
				most_costly = current;
			}
		}

		// Print the result
		System.out.println("\n================= Most Expensive Electronic ===================");
		System.out.println("\nMost expensive electronic item: ");
		System.out.println(most_costly);
		System.out.println();

	}

}

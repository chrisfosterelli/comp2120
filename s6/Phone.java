/* COMP2120 Seminar 6 Assignment
 * Phone.java - Extends Electronic Class
 * Christopher Foster
 * October 29, 2012 */

public class Phone extends Electronic {

	/* Instance variables */
	private String number;

	/* Constructors */
	public Phone(String manufacturer, String model, double weight,
		     double power, double cost, String number) {
		super(manufacturer, model, weight, power, cost);
		this.setNumber(number);
	}

	public Phone() {
		super();
		this.setNumber("N/A");
	}

	/* Accessors */
	public String getNumber() {
		return this.number;
	}

	/* Mutators */
	public void setNumber(String number) {
		this.number = number;
	}

	/* Main function */
	public void call(String number) {
		if (!this.isOn()) {
			System.out.println("Phone is off.");
		} else {
			System.out.println("Connecting call from " + this.getNumber() +
					   " to " + number + "...");
		}
	}

	/* toString method */
	public String toString() {
		return super.toString() + "\n" + 
		       "Phone number: " + this.getNumber();
	}

}

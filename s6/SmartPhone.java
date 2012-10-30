/* COMP2120 Seminar 6 Assignment
 * SmartPhone.java - Extends Phone Class
 * Christopher Foster
 * October 29, 2012 */

public class SmartPhone extends Phone {

	/* Instance variable */
	private int appcount;

	/* Constructors */
	public SmartPhone(String manufacturer, String model, double weight,
			  double power, double cost, String number,
			  int appcount) {
		super(manufacturer, model, weight, power, cost, number);
		this.setAppcount(appcount);
	}

	public SmartPhone() {
		super();
		this.setAppcount(0);
	}

	/* Accessors */
	public int getAppcount() {
		return this.appcount;
	}

	/* Mutators */
	public void setAppcount(int appcount) {
		this.appcount = appcount;
	}

	/* Main functions */
	public void installApp() {
		if (!this.isOn()) {
			System.out.println("Smartphone is off");
		} else {
			System.out.println("Application installed.");
			this.appcount++;
		}
	}

	public void uninstallApp() {
		if (!this.isOn()) {
			System.out.println("Smartphone is off");
		} else {
			System.out.println("Application uninstalled.");
			this.appcount--;
		}
	}

	/* toString method */
	public String toString() {
		return super.toString() + "\n" + 
		       "Installed applications: " + this.getAppcount();
	}

}

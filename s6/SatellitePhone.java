/* COMP2120 Seminar 6 Assignment
 * SatellitePhone.java - Extends Phone Class
 * Christopher Foster
 * October 29, 2012 */

public class SatellitePhone extends Phone {

	/* Instance variable */
	private boolean connected;

	/* Constructors */
	public SatellitePhone(String manufacturer, String model, double weight,
			      double power, double cost, String number,
			      boolean connected) {
		super(manufacturer, model, weight, power, cost, number);
		this.connected = connected;
	}

	public SatellitePhone() {
		super();
		this.connected = false;
	}

	/* Main functions */
	public void connect() {
		if (!this.isOn()) {
			System.out.println("Satellite phone is off");
		} else {
			System.out.println("Locating satellite... ");
			System.out.println("Connected.");
			this.connected = true;
		}
	}

	public void disconnect() {
		if (!this.isOn()) {
			System.out.println("Satellite phone is off");
		} else {
			System.out.println("Disconnected from satellite.");
			this.connected = false;
		}
	}

	public boolean isConnected() {
		return this.connected;
	}

	/* Override the default call function */
	public void call(String number) {
		if (!this.isOn()) {
			System.out.println("Satellite phone is off");
		} else if (!this.isConnected()) {
			System.out.println("Not connected to satellite!");
		} else {
			System.out.println("Dialing satellite... ");
			super.call(number);
		}
	}

	/* toString method */
	public String toString() {
		return super.toString() + "\n" +
		       "Satellite connection status: " + this.isConnected();
	}
}

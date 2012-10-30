/* COMP2120 Seminar 6 Assignment
 * Television.java - Extends Electronic Class
 * Christopher Foster
 * October 29, 2012 */

public class Television extends Electronic {

	/* Instance variables */
	private int channel;

	/* Constructors */
	public Television(String manufacturer, String model, double weight,
			  double power, double cost, int channel) {
		super(manufacturer, model, weight, power, cost);
		this.setChannel(channel);
	}

	public Television() {
		super();
		this.setChannel(0);
	}

	/* Accessors */
	public int getChannel() {
		return this.channel;
	}

	/* Mutators */
	public void setChannel(int channel) {
		this.channel = channel;
	}

	/* Main functions */
	public void channelUp() {
		if (!this.isOn()) {
			System.out.println("TV is not on");
		} else {
			this.channel++;
		}
	}

	public void channelDown() {
		if (!this.isOn()) {
			System.out.println("TV is not on");
		} else {
			this.channel--;
		}
	}

	/* toString method */
	public String toString() {
		return super.toString() + "\n" + 
		       "Current channel: " + this.getChannel();
	}

}

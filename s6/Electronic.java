/* COMP2120 Seminar 6 Assignment
 * Electronic.java - Abstract Electronic Class
 * Christopher Foster
 * October 29, 2012 */

public class Electronic {

	/* Instance variables */
	private String manufacturer;
	private String model;
	private boolean state;
	private double weight;
	private double power;
	private double cost;

	/* Constructors */
	public Electronic() {
		this.setManufacturer("N/A");
		this.setModel("N/A");
		this.setWeight(0.0);
		this.setPower(0.0);
		this.setCost(0.0);
	}

	public Electronic(String manufacturer, String model, 
			  double weight, double power, double cost) {
		this.setManufacturer(manufacturer);
		this.setWeight(weight);
		this.setPower(power);
		this.setModel(model);
		this.setCost(cost);
	}

	/* Standard accessors */
	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getModel() {
		return this.model;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getPower() {
		return this.power;
	}

	public double getCost() {
		return this.cost;
	}

	/* Standard mutators */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	/* Main methods */
	public void turnOn() {
		this.state = true;
	}

	public void turnOff() {
		this.state = false;
	}

	public boolean isOn() {
		return this.state;
	}

	/* toString method */
	public String toString() {
		return "Manufacturer: " + this.getManufacturer() + "\n" +
		       "Product Model: " + this.getModel() + "\n" +
		       "Product Weight: " + this.getWeight() + "kg\n" +
		       "Power Usage: " + this.getPower() + "V\n" + 
		       "Cost (USD): $" + this.getCost();
	}
}

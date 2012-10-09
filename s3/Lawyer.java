/* COMP2120 Seminar 3 Assignment
 * Lawyer.java - Lawyer Class
 * Christopher Foster
 * October 2, 2012 */

public class Lawyer {

	/* Instance variables */
	private double rate;
	private Person name;
	private String field;
	private static String company = "XYZ Law Company";

	/* Constructors */
	public Lawyer() {
		this.field = new String("N/A");
		this.name = new Person();
		this.rate = 0.0;
	}

	public Lawyer(String firstName, String lastName,
		      String practice, double hourlyrate) {
		this.name = new Person(firstName, lastName);
		this.rate = hourlyrate;
		this.field = practice;
	}

	/* Mutators */
	public void setName(String firstName, String lastName) {
		this.name.setFirstName(firstName);
		this.name.setLastName(lastName);
	}

	public void setPractice(String practice) {
		this.field = practice;
	}

	public void setRate(double hourlyrate) {
		this.rate = hourlyrate;
	}

	/* Accessors */
	public String getCompany() {
		return this.company;
	}

	public String getPractice() {
		return this.field;
	}

	public String getName() {
		return this.name.toString();
	}

	public double getRate() {
		return this.rate;
	}

	/* Typical methods */
	public String toString() {
		String rslt = new String();

		rslt += this.company;
		rslt += ("\nName: " + this.name);
		rslt += ("\nPractice: " + this.field);
		rslt += ("\nHourly Rate: " + this.rate);

		return rslt;
	}

	public boolean equals(Lawyer opt) {
		return (opt.toString().equals(this.toString()));
	}

	/* Calculate the paycheck for this lawyer */
	public String calcPayCheck(int hours) {
		return "$" + String.format("%.2f", this.rate * hours);
	}
}

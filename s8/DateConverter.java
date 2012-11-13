/* COMP2120 Seminar 8 Assignment
 * DateConverter.java - Handles User Input / Console Output
 * Christopher Foster
 * November 12, 2012 */

import java.util.Scanner;

public class DateConverter {
	public static void main(String args[]) {
		Scanner scanIn = new Scanner(System.in);
		String parsedDate, inputDate;
		boolean valid = false;

		while (!valid) {
			try {
				System.out.print("Please enter a date (mm/dd/yyyy)): ");

				inputDate = scanIn.nextLine();
				parsedDate = DateParser.parse(inputDate);

				System.out.println(parsedDate + " is a valid date.");
				valid = true;
			}
			catch (MonthDayException e) {
				System.out.println(e.getMessage());
			}
			catch (SlashException e) {
				System.out.println(e.getMessage());
			}
			catch (MonthException e) {
				System.out.println(e.getMessage());
			}
			catch (YearException e) {
				System.out.println(e.getMessage());
			}
			catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}

		scanIn.close();
	}
}

/* COMP2120 Seminar 8 Assignment
 * DateParser.java - Parses Date Strings (mm/dd/yyyy)
 * Christopher Foster
 * November 12, 2012 */

public class DateParser {

	public static int[] monthDays = {
		31, 28, 31, 30, 31, 30,
		31, 31, 30, 31, 30, 31
	};

	public static String[] monthNames = {
		"January", "February", "March", "April", "May", "June", "July",
		"August", "September", "October", "November", "December"
	};

	/* Parse a string containing a date in the form (mm/dd/yyyy)
	 * into an extended date string containing the full month name */
	public static String parse(String date) throws NumberFormatException {

		// Locate separating characters (/)
		
		int s1, s2, s3;
		s1 = date.indexOf('/');
		s2 = date.indexOf('/', s1+1);
		s3 = date.indexOf('/', s2+1); // For validation

		if ((s1 == -1 || s2 == -1) || s3 != -1) {
			throw new SlashException();
		}

		// Parse out the strings
		
		String smonth = date.substring(0, s1);
		String sday   = date.substring(s1+1, s2);
		String syear  = date.substring(s2+1);

		// Convert the strings to integers
		
		int month, day, year;
		
		try {
			month = Integer.parseInt(smonth);
			day   = Integer.parseInt(sday);
			year  = Integer.parseInt(syear);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("The input part " + 
				e.getMessage().substring(18) + " is not an integer");
		}
			
		// Preform checks
		
		if (month < 1 || month > 12) {
			throw new MonthException(month);
		}

		if (year < 1900 || year > 2012) {
			throw new YearException(year);
		}

		if (day < 1 || day > monthDays[month-1]) {
			// Account for leap years
			// Any year divisible by 4 but not divisible by 100 unless it is also divisible by 400 
			if (month == 2 && ((year % 4 == 0 && year % 100 != 0) ||
					   (year % 4 == 0 && year % 400 == 0)) ) {
				// Preform the same check, with an addition day added to February
				if (day < 1 || day > monthDays[month-1]+1) {
					throw new MonthDayException(monthNames[month-1], day);
				}
			} else {
				throw new MonthDayException(monthNames[month-1], day);
			}
		}
			
		// Format output

		return monthNames[month-1] + " " + day + ", " + year;

	}

}

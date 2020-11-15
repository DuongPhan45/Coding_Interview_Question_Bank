package implementation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day_Of_The_Programmer {

//	Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.
//
//	From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.
//
//	In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:
//
//	Divisible by 400.
//	Divisible by 4 and not divisible by 100.
//	Given a year, , find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .
//
//	For example, the given  = 1984. 1984 is divisible by 4, so it is a leap year. The 256th day of a leap year after 1918 is September 12, so the answer is .
//
//	Function Description
//
//	Complete the dayOfProgrammer function in the editor below. It should return a string representing the date of the 256th day of the year given.
//
//	dayOfProgrammer has the following parameter(s):
//
//	year: an integer
//	

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) throws ParseException {
		String s = "01.01." + year;
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		// get the calendar object to given date
		Calendar c = Calendar.getInstance();
		// parse the time as format
		c.setTime(formatter.parse(s));
		if (year < 1918) {// the only differece in this time is that year divides by both 4 and 100 is not
							// lap year-> subtract 1 day
			if (year % 4 == 0 & year % 100 == 0) {
				c.add(Calendar.DAY_OF_MONTH, 255 - 1);
			} else {
				c.add(Calendar.DAY_OF_MONTH, 255);
			}
		} else if (year == 1918) {// in 1918 skip 13 days (from Feb 1 to Feb 13)
			c.add(Calendar.DAY_OF_MONTH, 255 + 13);

		} else if (year > 1918) {// after this date, just add 255 days and Calendar will help to calculate the
									// day
//			if ((year % 400 == 0) && (year % 4 == 0 && year % 100 != 0)) {
//			}

			c.add(Calendar.DAY_OF_MONTH, 255);// add 255 days (1.1 counted as 1st day)
		}
		// String representing new date
		String newDate = formatter.format(c.getTime());
		return newDate;

	}

	// shorter simpler way down here
	static String solve( int year ) {

	    if( year == 1918 ) return "26.09.1918";
	    if( isLeap( year ) ) return "12.09." + Integer.toString( year );
	    else return "13.09." +  year ;

	}

	static boolean isLeap( int year ) {

	    if( year % 4 != 0 ) return false;
	    if( year > 1918 && year % 100 == 0 && year % 400 != 0 ) return false;
	    return true;

	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println(dayOfProgrammer(1920));
		System.out.println(solve(2017));
	}

//	Test cases:
//		1917	09.13.1917
//		1918	26.09.1918
//		1919	13.09.1919
//		1920	12.09.1920
//		2018	13.09.2018
//		2017	13.09.2017

}

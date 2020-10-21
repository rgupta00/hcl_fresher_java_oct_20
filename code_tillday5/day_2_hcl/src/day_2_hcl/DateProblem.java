package day_2_hcl;

import java.util.Scanner;

public class DateProblem {
	public static void main(String[] args) {
		// today date is provided and we need to find next date

		int day, month, year;
		// -1 indicate that it is invalid month .... java==index 1
								//    jan  feb m   a  m    j  ju  aug  sep oct nov dec
		int noOfDaysInMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE day month and year");
		day = scanner.nextInt();
		month = scanner.nextInt();
		year = scanner.nextInt();
		

		if(isLeapYear(year)) {
			// set no of days for feb =29
			noOfDaysInMonth[2]++;
		}

		System.out.println("current date information:" + day + ": " + month + ": " + year);
		// 31:12:2020

		day = day + 1;
		if (day > noOfDaysInMonth[month]) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}

		System.out.println("next date information:" +  day + ": " + month + ": " + year);
	}

	 static boolean isLeapYear(int year) {
		return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
	}

}

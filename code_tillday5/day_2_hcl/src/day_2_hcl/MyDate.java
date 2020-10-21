package day_2_hcl;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private int noOfDaysInMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public MyDate(int day, int month, int year) {
		//logic for date validation must be written
		
		this.day=day;
		this.month=month;
		this.year=year;
	
		if(isLeapYear()) {
			noOfDaysInMonth[2]++;
		}
	}
	
	public MyDate getNextDate() {
		
		int tempDay = day + 1;
		int tempMonth=month;
		int tempYear=year;
		
		if (tempDay > noOfDaysInMonth[month]) {
			tempDay = 1;
			tempMonth++;
			if (tempMonth > 12) {
				tempMonth = 1;
				tempYear++;
			}
		}
		return new MyDate(tempDay, tempMonth, tempYear);
	}
	
    boolean isLeapYear() {
			return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
	}
	 
	public void printDateInformation() {
		System.out.println("date is :"+ day+" : "+ month+": "+ year);
	}
	
}

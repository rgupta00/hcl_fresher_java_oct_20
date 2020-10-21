package day_2_hcl;

public class MyDateTester {

	public static void main(String[] args) {
		
		MyDate date=new MyDate(31, 12, 2020);
		MyDate date2=date.getNextDate();
		
		date.printDateInformation();
		System.out.println("--------------");
		date2.printDateInformation();
		
	}
}

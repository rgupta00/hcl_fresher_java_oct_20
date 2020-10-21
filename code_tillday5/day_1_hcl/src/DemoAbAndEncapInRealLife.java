
class Emploee {
	private int id;
	private String name;
	private double salary;

	public Emploee(int eid, String ename, double esalary) {
		id = eid;
		name = ename;
		salary = esalary;
	}

	public void increment(double percentage) {
		if (percentage < 1)
			salary = salary + salary * percentage;
		else
			System.out.println("inc % should be less then 1");
	}

	public void print() {
		System.out.println("employee details: id " + id + " name " + name + " salary " + salary);
	}
}

public class DemoAbAndEncapInRealLife {

	public static void main(String[] args) {
		Emploee emploee = new Emploee(121, "raja", 3000);
		emploee.print();

		emploee.increment(1000);
		emploee.print();
	}

}

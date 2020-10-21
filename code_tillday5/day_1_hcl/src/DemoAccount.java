
class Account{
	private int id;
	private String name; 
	private double balance; 
	
	private static String bankName;
	
	//default ctr: it is provided by default
	Account(){
		System.out.println("it is defalut ctr");
	}
	
	//parameterized ctr
	 public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//copy ctr: ie used to create a new object from older object
	
	//parameterized ctr
		public Account(Account account) {
			this.id = account.id;
			this.name = account.name;
			this.balance = account.balance;
		}
	 
	 
	 
	 
	public void print() {
		System.out.println("the account details: id"+ id+" name :"+ name+" balance: "+ balance);
	}
	
	
}

public class DemoAccount {
	
	public static void main(String[] args) {
		Account account=new Account(11, "raja",569.00);
		
		Account account2=new Account(account);
		
		account.print();
		account2.print();
	}

}

package com.day3.session2;

abstract class Account{
	private int accId;
	private String name;
	private double balance;
	
	
	public Account(int accId, String name, double balance) {
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}

	
	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

class SavingAccount extends Account{
	
	
	private double intrestRate;
	
	public SavingAccount(int accId, String name, double balance, double intrestRate) {
		super(accId, name, balance);
		this.intrestRate = intrestRate;
	}

	public String toString() {
		return "intrestRate:"+ intrestRate + super.toString();
	}
	
}


public class AccountApp {
	
	public static void main(String[] args) {
		
	}

}

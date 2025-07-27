package com;

public class BankAccount {
	
	private String accountHolderName;
	private int atmPin;
	private long accountNumber;
	private double balance;
	
	public BankAccount() {
		
	}

	

	public BankAccount(String accountHolderName, int atmPin, long accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.atmPin = atmPin;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	

	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName + ", atmPin=" + atmPin + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}
	
	

}

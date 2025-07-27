package com.practice;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

class Bank{
	int bankBalance=5000;
	
	public  void withdrawFunds(int withdrawAmount) throws InsufficientFundsException{
		if(withdrawAmount > bankBalance) {
			throw new InsufficientFundsException("Insufficient Funds !!");
		}
		else {
			int totalBalance=bankBalance-withdrawAmount;
			System.out.println("Collect your Amount: "+withdrawAmount);
			System.out.println("Remaining Bank Balance : "+totalBalance);
		}
	}
}

public class BankTest{
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		
		try {
			bank.withdrawFunds(2000);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thanks !!! Visit Again !!");
		}
	}
	
}

package com;

import java.util.Scanner;

public class TestAtm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BankAccount[] bankAccounts= {new BankAccount("Naganna",1234,12345678,20000),new BankAccount("Lakshmi",2345,87654321,4000),new BankAccount("Raj",3456,23456789,50000)};
		
		AtmOperations atmOperations=new AtmOperations();
		System.out.println("Enter Account Number:");
		long accountNumber=sc.nextLong();
		
		BankAccount currentAccount=null;
		for(BankAccount bankAccount :bankAccounts) {
			
			if(accountNumber==bankAccount.getAccountNumber()) {
				System.out.println("Enter Pin: ");
				int pin=sc.nextInt();
				if(pin==bankAccount.getAtmPin()) {
					currentAccount=bankAccount;
					break;
				}
				else {
					System.out.println("Incorrect Pin Entered!!");
					return;
				}
				
			}
			
		}
		if(currentAccount==null) {
			System.out.println("No Account Found!!");
			return;
		}
		
		while(true) {
			System.out.println("Welcome "+currentAccount.getAccountHolderName());
			System.out.println("1.CheckBalance");
			System.out.println("2.Withdraw Amount");
			System.out.println("3.Deposit Amount");
			System.out.println("4.Tranfer Amount");
			System.out.println("5.Exit");
			System.out.println("Choose Option:");
			
			int option=sc.nextInt();
			
			switch(option) {
			
			case 1:
				double balance=atmOperations.checkBalance(currentAccount);
				System.out.println("Total Balance: "+balance);
			}
		}
		
		
	}
}

package com.debit;

import java.util.Scanner;

public class BankAccount {
	
	int balance=1000;
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public  void  withdraw(int amount) {
		
		synchronized(this) {
			if(balance>=amount) {
				
				System.out.println(Thread.currentThread().getName()+" Withdrawing balance before"+ balance);
				balance-=amount;
				
				System.out.println(Thread.currentThread().getName()+" Withdrawing balance after"+ balance);
				}
		}
	}
	
	public int getBalance() {
		return balance;
	}
	

}

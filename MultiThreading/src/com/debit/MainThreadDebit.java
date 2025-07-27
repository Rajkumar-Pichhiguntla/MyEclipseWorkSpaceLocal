package com.debit;

import java.util.Scanner;

public class MainThreadDebit {
	Scanner sc;
	
	public static void main(String[] args) throws InterruptedException {
		
		BankAccount bankAccount=new BankAccount();
		
		Account1 acc1=new Account1(bankAccount);
		Account2 acc2=new Account2(bankAccount);
		acc1.start();
		acc2.start();
		acc1.join();
		acc2.join();
		System.out.println("final: "+bankAccount.getBalance());
		
	}

}

class Account1 extends Thread{
	Scanner sc;
	BankAccount bankAccount;
	

	
	public Account1(BankAccount bankAccount) {
		this.bankAccount=bankAccount;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<1000;i++) {
			
			bankAccount.withdraw(300);
		}
	}
}

class Account2 extends Thread{
	Scanner sc;
	BankAccount bankAccount;
	
	public Account2(BankAccount bankAccount) {
		this.bankAccount=bankAccount;
	}
	@Override
	public void run() {
		
		for(int i=0;i<1000;i++) {
			
			bankAccount.withdraw(300);
		}
	}

}

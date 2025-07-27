package com;

import java.util.Scanner;

public class AtmOperations {
	
	Scanner sc=new Scanner(System.in);
	
	public double checkBalance(BankAccount bankAccount) {
		return bankAccount.getBalance();
	}
	
}

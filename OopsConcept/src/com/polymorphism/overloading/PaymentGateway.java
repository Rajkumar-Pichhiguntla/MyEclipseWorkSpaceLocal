package com.polymorphism.overloading;

import java.util.Scanner;

public class PaymentGateway {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		PaymentGateway pg=new PaymentGateway();
		int select=-1;
		System.out.println("Payment Gateway");
			System.out.println("Enter number to select Payment method :");
			select=sc.nextInt();
			
			if(select==1) {
				System.out.println("Enter Amount to pay : ");
			    int amount=sc.nextInt();
				pg.paymentMethod(amount);
			}
			else if(select==2) {
				System.out.println("Enter Card Number:");
				long cardNumber=sc.nextLong();
				System.out.println("enter cvv:");
				int cvv=sc.nextInt();
				System.out.println("Enter Amount to pay : ");
			    int amount=sc.nextInt();
				pg.paymentMethod(cardNumber,cvv,amount );
			}
			else if(select==3) {
				System.out.println("Enter UPI Id: ");
				String upiId=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Password :");
				int password=sc.nextInt();
				System.out.println("Enter Amount to pay : ");
			    int amount=sc.nextInt();
				
				pg.paymentMethod(upiId, amount, password);
			}
			else if(select==4) {
				System.out.println("Enter pin :");
				String pin=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Amount to pay : ");
			    int amount=sc.nextInt();
				
				
				pg.paymentMethod(pin,amount);
			}
			else if(select==5) {
				System.out.println("Enter Bank Account Number : ");
				long bankAccountNumber=sc.nextLong();
				System.out.println("Enter Amount to pay : ");
			    int amount=sc.nextInt();
				System.out.println("Enter OTP :");
				int otp=sc.nextInt();
				
				pg.paymentMethod(bankAccountNumber, amount, otp);
			}
			else if(select==0) {
				System.out.println("Exit");
			}
			else {
				System.out.println("Invalid Option");
			}
		
		
		
		
	}
	//COD
	void paymentMethod(int amount) {
		
		System.out.println("ThankYou!!!   Payment Done Successfully through COD.....");
	}
	//Card Payment
	void paymentMethod(long cardNumber,int cvv,int amountToPay) {
		
		System.out.println("ThankYou!!!   Payment Done Successfully through Card.....");
	}
	//UPI Payment
	void paymentMethod(String upiId,int password,int amountToPay) {
		
		
		System.out.println("ThankYou!!!   Payment Done Successfully through UPI Payment.....");
	}
	//Wallet Payment
	void paymentMethod(String pin,int amountToPay) {
		
		System.out.println("ThankYou!!!   Payment Done Successfully through Wallet.....");
		
	}
	
	//NetBanking Payment
	void paymentMethod(String username,String password,int amountToPay) {
		
		System.out.println("ThankYou!!!   Payment Done Successfully through NetBanking.....");
	}
	
}

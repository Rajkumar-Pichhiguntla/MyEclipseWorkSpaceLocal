package com.interfaces;

public class Main {

	
	public static void main(String[] args) {
		
		Airtel ar=new Airtel();
		ar.calling();
		ar.data();
		ar.message();
		ar.recharge();
		
		Jio j=new Jio();
		
		j.calling();
		j.data();
		j.message();
		j.recharge();
	}
}

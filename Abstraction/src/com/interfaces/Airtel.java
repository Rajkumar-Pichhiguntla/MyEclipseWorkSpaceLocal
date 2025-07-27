package com.interfaces;

public class Airtel implements Trai {
		
	public void calling() {
		System.out.println("call at 1p/1s");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("2G");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("100 sms");
	}

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		System.out.println("1 GB at 100 rs..");
	}
}

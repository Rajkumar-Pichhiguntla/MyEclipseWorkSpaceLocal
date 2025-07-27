package com.optional;

public class Test {
	
	public static void main(String[] args) {
		
		User user=new User(10,null);
		String email=user.getUserEmailById(10);
		System.out.println(email);
	}

}

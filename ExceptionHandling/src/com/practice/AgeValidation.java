package com.practice;

import java.io.IOException;

public class AgeValidation {
	
	public static void main(String[] args) throws Exception {
		AgeValidation a=new AgeValidation();
		
		try {
			a.checkEligibility(16);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void checkEligibility(int age) throws Exception{
		if(age<18) {
			throw new InvalidAgeException("Not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}

}

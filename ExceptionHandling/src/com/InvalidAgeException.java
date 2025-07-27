package com;

public class InvalidAgeException extends Exception {

	private String information;

	public InvalidAgeException(String information){
		this.information=information;
	}
}

package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	private int PassNumber;
	private String issuedPlace;
	
	@OneToOne(mappedBy="passport",cascade=CascadeType.ALL)
	private User user;
	
	public Passport() {
		
	}

	public Passport(int passNumber, String issuedPlace) {
		super();
		PassNumber = passNumber;
		this.issuedPlace = issuedPlace;
	}

	public Passport(String name) {
		this.issuedPlace=name;
	}

	public int getPassNumber() {
		return PassNumber;
	}

	public void setPassNumber(int passNumber) {
		PassNumber = passNumber;
	}

	public String getIssuedPlace() {
		return issuedPlace;
	}

	public void setIssuedPlace(String issuedPlace) {
		this.issuedPlace = issuedPlace;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Passport [PassNumber=" + PassNumber + ", issuedPlace=" + issuedPlace +"]";
	}
	
	
}

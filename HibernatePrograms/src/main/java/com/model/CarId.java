package com.model;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable

public class CarId {

	private int id;
	private String engineNumber;
	
	public CarId() {
				
	}
	public CarId(int id, String engineNumber) {
		super();
		this.id = id;
		this.engineNumber = engineNumber;
	}
	
	public CarId(String engineNumber) {
		super();
		this.engineNumber = engineNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	@Override
	public String toString() {
		return "CardId [id=" + id + ", engineNumber=" + engineNumber + "]";
	}
	
	

}

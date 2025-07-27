package com.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;


@Entity
public class Car {
	
	@EmbeddedId
	private CarId carId;
	private String carName;
	private double price;
	
	public Car() {
		
	}

	public Car(CarId carId, String carName, double price) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.price = price;
	}

	public CarId getCarId() {
		return carId;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", price=" + price + "]";
	}
	
	
	

}

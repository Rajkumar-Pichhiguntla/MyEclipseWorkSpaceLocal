package com;

public class Driver {
	
	private int idOfDriver;
	private String nameOfDriver;
	private String categoryOfDriver;
	private double totalDistanceTravelled;
	
	public Driver() {
		
	}
	
	public Driver(int idOfDriver, String nameOfDriver, String categoryOfDriver, double totalDistanceTravelled) {
		super();
		this.idOfDriver = idOfDriver;
		this.nameOfDriver = nameOfDriver;
		this.categoryOfDriver = categoryOfDriver;
		this.totalDistanceTravelled = totalDistanceTravelled;
	}

	public int getIdOfDriver() {
		return idOfDriver;
	}

	public void setIdOfDriver(int idOfDriver) {
		this.idOfDriver = idOfDriver;
	}

	public String getNameOfDriver() {
		return nameOfDriver;
	}

	public void setNameOfDriver(String nameOfDriver) {
		this.nameOfDriver = nameOfDriver;
	}

	public String getCategoryOfDriver() {
		return categoryOfDriver;
	}

	public void setCategoryOfDriver(String categoryOfDriver) {
		this.categoryOfDriver = categoryOfDriver;
	}

	public double getTotalDistanceTravelled() {
		return totalDistanceTravelled;
	}

	public void setTotalDistanceTravelled(double totalDistanceTravelled) {
		this.totalDistanceTravelled = totalDistanceTravelled;
	}

	@Override
	public String toString() {
		return "Driver [idOfDriver=" + idOfDriver + ", nameOfDriver=" + nameOfDriver + ", categoryOfDriver="
				+ categoryOfDriver + ", totalDistanceTravelled=" + totalDistanceTravelled + "]";
	}

	
	
}

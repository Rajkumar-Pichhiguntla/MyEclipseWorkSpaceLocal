package com.model;

public class Driver {
	
	private int driverId;
	private String driverName;
	private String category;
	private double travelledDistance;
	
	public Driver() {
		
	}

	public Driver(int driverId, String driverName, String category, double travelledDistance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.travelledDistance = travelledDistance;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getTravelledDistance() {
		return travelledDistance;
	}

	public void setTravelledDistance(double travelledDistance) {
		this.travelledDistance = travelledDistance;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", travelledDistance=" + travelledDistance + "]";
	}
	
	

}

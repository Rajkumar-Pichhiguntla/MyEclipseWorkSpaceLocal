package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Travel {
	
	Scanner sc=new Scanner(System.in);
	
	
	
	public boolean isCarDiver(Driver driver) {
//		return "Car".equalsIgnoreCase(driver.getCategoryOfDriver());
		
		return driver.getCategoryOfDriver().equalsIgnoreCase("CAR");
		
		
		
	}
	public String retriveByDriverId(Driver[] driver,int driverId) {
		
		
		for(Driver drivers:driver) {
			if(drivers.getIdOfDriver()==driverId) {
				return "Driver name is "+drivers.getNameOfDriver()+" Belonging to category "+drivers.getCategoryOfDriver()+" travelled "+drivers.getTotalDistanceTravelled()+" KM so far..";
			}
		}
		return "Driver Not Found";
		
	}
	
	//ArrayList
//	
//	public String retriveByDriverId(ArrayList<Driver> drivers ,int driverId) {
//		for(Driver drivers:driver) {
//			if(drivers.getIdOfDriver()==driverId) {
//				return "Driver name is "+drivers.getNameOfDriver()+" Belonging to category "+drivers.getCategoryOfDriver()+" travelled "+drivers.getTotalDistanceTravelled()+" KM so far..";
//			}
//		}
//		return "Driver Not Found";
//		
//		return  drivers
//				.stream()
//				.filter(d-> d.getCategoryOfDriver()==driverId)
//				.findFirst()
//				.map(d-> String.format("Driver name is %s belonging to category %s travelled %d KM so far", ))
//		
//		
//	}
	
	public int retriveCountOfDrivers(Driver[] driver,String category) {
		int count=0;
		for(Driver drivers:driver) {
			if(drivers.getCategoryOfDriver().equalsIgnoreCase(category)) {
				count++;
			}
		}
		
		
		return count;
		
	}
	
	public Driver[] retriveDriver(Driver[] drivers,String category) {
		 
		int count=retriveCountOfDrivers(drivers,category);
		Driver[] matchedDrivers=new Driver[count];
		int index=0;
		for(Driver driver:drivers) {
			if(driver.getCategoryOfDriver().equalsIgnoreCase(category)) {
				matchedDrivers[index]=driver;
				index++;
			}
		}
		
		return matchedDrivers;
		

	}
	
	public Driver retriveMaxDistanceTravelledDriver(Driver[] drivers) {
		
		if(drivers.length==0) {
			return null;
		}
		Driver maxDriver=drivers[0];
		for(Driver driver:drivers) {
			if(driver.getTotalDistanceTravelled()>maxDriver.getTotalDistanceTravelled()) {
				maxDriver=driver;
			}
		}
		
		
		return maxDriver ;
	}
	

}

package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.model.Driver;

public class Travel {
	
	
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equalsIgnoreCase("Car");
		
	}
	
	public String retriveByDriverId(ArrayList<Driver> drivers , int driverId) {
		
//		for(Driver driver:drivers) {
//			if(driverId==driver.getDriverId()) {
//				return "Driver name is "+driver.getDriverName()+" Belonging to the category "+driver.getCategory()+" travelled "+driver.getTravelledDistance()+" KM so far.";
//			}
//		}
//		
//		return "Driver Not Found!!";
		
		return drivers.stream()
				.filter((driver)-> driver.getDriverId()== driverId)
				.findFirst()
				.map(d-> String.format("Driver name is %s Belonging to the category %s travelled %.2f KM so far", d.getDriverName(),d.getCategory(),d.getTravelledDistance()))
				.orElse("Driver Not Found!!");
	}
	
	public Long retriveCountOfDriver(ArrayList<Driver> drivers,String category) {
		
//		int count=0;
//		for(Driver driver:drivers) {
//			if(category.equalsIgnoreCase(driver.getCategory())) {
//				count++;
//			}
//		}
//		return count;
		return drivers
				.stream()
				.filter(d-> category.equalsIgnoreCase(d.getCategory()))
				.count();
	}
	
	public List<Driver> retriveDriver(ArrayList<Driver> drivers,String category){
		
//		ArrayList<Driver> matchedDrivers=new ArrayList<Driver>();
//		
//		for(Driver driver:drivers) {
//			if(category.equalsIgnoreCase(driver.getCategory())) {
//				matchedDrivers.add(driver);
//			}
//		}
//		return matchedDrivers;
		
		return drivers.stream().filter(d-> category.equalsIgnoreCase(d.getCategory())).toList();
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers){
		
//		Driver maxDriver=drivers.get(0);
//		for(Driver driver:drivers) {
//			if(driver.getTravelledDistance() > maxDriver.getTravelledDistance()) {
//				maxDriver=driver;
//			}
//		}
//		
//		return maxDriver;
		
		return drivers
				.stream()
				.sorted((d1,d2)-> Double.compare(d2.getTravelledDistance(), d1.getTravelledDistance()))
				.findFirst()
				.get();
		
	}

}

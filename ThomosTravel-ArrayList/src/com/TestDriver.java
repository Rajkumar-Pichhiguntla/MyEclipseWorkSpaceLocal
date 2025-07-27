package com;

import java.util.ArrayList;
import java.util.List;

import com.model.Driver;
import com.service.Travel;

public class TestDriver {
	
	public static void main(String[] args) {
		Travel t=new Travel();
			
			ArrayList<Driver> drivers=new ArrayList<Driver>();
			drivers.add(new Driver(101,"Raj","Car",2000));
			Driver driver=new Driver(201,"Anil","Car",3500);
			drivers.add(new Driver(102,"Pavan","Lorry",1500));
			drivers.add(new Driver(103,"Shiva","Auto",3000));
			drivers.add(new Driver(104,"Gaja","Car",1000));
			drivers.add(new Driver(105,"Sneha","Scooty",1200));
			
			
			boolean result=t.isCarDriver(driver);
			System.out.println(result);
			
			String driverDetails=t.retriveByDriverId(drivers, 101);
			System.out.println(driverDetails);
			
			long count=t.retriveCountOfDriver(drivers, "scooty");
			System.out.println(count);
			
			List<Driver> driversList=t.retriveDriver(drivers, "car");
			System.out.println(driversList);
			
			Driver maxTravelledDriver=t.retriveMaximumDistanceTravelledDriver(drivers);
			System.out.println(maxTravelledDriver);
		}

}

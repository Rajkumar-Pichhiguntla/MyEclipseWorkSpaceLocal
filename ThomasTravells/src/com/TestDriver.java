package com;

import java.util.Scanner;

public class TestDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Driver[] drivers= {new Driver(1,"raju","Car",7300),new Driver(2,"ravi","Lorry",8000),new Driver(3,"Vishnu","Auto",8000),new Driver(4,"Pavan","Car",5000),new Driver(5,"Gajendra","Lorry",6300)};
		
		Travel travel=new Travel();
		
		
		int option=-1;
		boolean showMenu=true;
		while(showMenu) {
			if(showMenu) {
				System.out.println("*****Welcome To Thomos Travels***");
				
				System.out.println("1.Is Car Driver");
				System.out.println("2.Retrive Driver Details By his Id");
				System.out.println("3.Retrive Count of Drivers");
				System.out.println("4.Retrive Driver Details with Category");
				System.out.println("5.Reteive Maximum Distance Travlled Driver details");
			}
			
			System.out.println("*****Select Option***");
			
			option=sc.nextInt();
			if(option==1) {
				//Is Car driver or Not
				
				for(Driver driver:drivers) {
				 boolean isCarDriver=travel.isCarDiver(driver);
				 System.out.println(driver.getNameOfDriver()+" is Car Driver : "+isCarDriver);
				
				}
			}
				
			else if(option==2) {
				//Retriving Driver Details By Id
				System.out.println("Enter Driver Id: ");
				int driverId=sc.nextInt();
				String retrivedDriverData=travel.retriveByDriverId(drivers, driverId);
				System.out.println(retrivedDriverData);
				
			}
			else if(option==3) {
				//Retriving count of drivers with category
				System.out.println("Enter Category to to get Count:");
				String category=sc.next();
				int countOfDriversWithCategory=travel.retriveCountOfDrivers(drivers,category);
				System.out.println("Count of "+category+" Drivers :"+countOfDriversWithCategory);
			}
				
			else if(option==4) {
				//DriversList with category
				System.out.println("Enter category to check: ");
				String category=sc.next();
				Driver[] result=travel.retriveDriver(drivers, category);
				for(Driver r:result) {
					System.out.println(r);
				}
			}
				
			else if(option==5) {
				//max distance
				
				Driver maxTravelledDriver=travel.retriveMaxDistanceTravelledDriver(drivers);
				if(maxTravelledDriver.getTotalDistanceTravelled()!=0) {
					System.out.println("Driver with max distance :"+maxTravelledDriver.getNameOfDriver()+" with "+maxTravelledDriver.getTotalDistanceTravelled()+" KM"); 
				}
			}
				
			else {
				System.out.println("Invalid Option");
				
			}
			
			System.out.println("Do u want menu again - Yes/No ");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("yes")) {
				showMenu=true;
			}
			else {
				showMenu=false;
				System.out.println("Exit");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

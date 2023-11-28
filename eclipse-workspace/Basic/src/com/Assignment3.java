package com;

public class Assignment3 {

	public static void main(String[] args) {
		String CarName="verna";
		int CC=2500;
		float price =2500000;
		float tax=0;
		float insurance=0;
		float GrandPrice=0;

		// tax calculation
		
		if(price<800000) {
			tax=price*.14f; 
		} if(price>800001 || price<15000000) {
			tax=price*.17f; 
		}
		if(price>1500001 || price<30000000) {
			tax=price*.21f; 
		}
		if(price>3000000) {
			tax=price* 0.26f;
		}
		
		// insurance for 5 years 
		
		if(CC>=800 && CC<=1500) {
			insurance=3580*5;
		}
		if(CC>=1501 && CC<=3000) {
			insurance=6850*5;
		}
		if(CC>30001) {
			insurance=8500*5;
		}
		GrandPrice=price+tax+insurance;
		System.out.println("The car name = "+CarName);
		System.out.println("Car price = " +price);
		System.out.println("Tax on your car = "+tax);
		System.out.println("Car price after tax = " +(price+tax));
		System.out.println("Car insurance price = "+insurance);
		System.out.println("Total price of car = "+GrandPrice);

	}
}

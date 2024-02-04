package jspider.com.p2;

import jspider.com.p1.Location;

public class LocationMainClass {
	public static void main(String[] args) {
		Location obj3= new Location(24894.865,345363.865,"South");
		obj3.setDirection("North");
		obj3.setLatitude(9876.1234);
		obj3.setLongitude(4567.9832);
		System.out.println("Updated location");
		System.out.println("Latitude: " +obj3.getLatitude());
		System.out.println("Longitude: " +obj3.getLongitude());
		System.out.println("Direction: " +obj3.getDirection());	
	}
}
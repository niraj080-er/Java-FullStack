package jspider.com.p1;

public class DirecctionMainClass {
	public static void main(String[] args) {
		Direction obj2= new Direction ("Jspider", "GeekyAnt", "East");
		System.out.println("Starting Designation: " +obj2.getStartingPoint());
		System.out.println("Ending Designation: " +obj2.getEndingPoint());
		System.out.println("Direction: " +obj2.getDirection());
		System.out.println("================");
		System.out.println("Update the Direction ");
		obj2.setDirection("South");
		obj2.setStartingPoint("Sai Ganesh Pg");
		obj2.setEndingPoint("Vega City Mall");
		System.out.println("Starting Designation: " +obj2.getStartingPoint());
		System.out.println("Ending Designation: " +obj2.getEndingPoint());
		System.out.println("Direction: " +obj2.getDirection());
		
	}
}

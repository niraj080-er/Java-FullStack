package jspider.com.p1;

public class CircleMainClass {
	public static void main(String[] args) {
		Circle obj5=new Circle(9.7);
		System.out.println("The Radius of Circle: " +obj5.getRadius());
		obj5.area();
		obj5.diaMeter();
		obj5.cirCumFerence();
		System.out.println("===============");
		System.out.println("Updated circle of radius");
		obj5.setRadius(23.34);
		System.out.println("The Radius of Circle: " +obj5.getRadius());
		obj5.area();
		obj5.diaMeter();
		obj5.cirCumFerence();	
	}
}

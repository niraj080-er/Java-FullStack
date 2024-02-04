package jspider.com.p1;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	void area() {
		double ar = 2*3.14*radius*radius;
		System.out.println("Area of Circle: " +ar);
	}
	void diaMeter() {
		double dia=2*radius;
		System.out.println("Circle of Diameter: " +dia);	
	}
	void cirCumFerence() {
		double cir=2*3.14*radius;
		System.out.println("Circumference of Circle: " +cir);
	}
	

}

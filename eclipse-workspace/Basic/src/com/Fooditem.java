package com;

public class Fooditem {
	public static void main(String[] args) {
	 String foodItem = "Brityani";
	 int price = 200;
	 int quantity= 45;
	 int totalprice = price*quantity;
	 float gst= totalprice* 0.18f;
	 float grandtotal= totalprice+gst;
	 System.out.println("The food item = "+foodItem);
	 System.out.println("Price of the item = " +price);
	 System.out.println("Quantity of the fooditem = " +quantity);
	 System.out.println("Total price of quantity = " +totalprice);
	 System.out.println("Add GSt = "+gst);
	 System.out.println("Total you have to paid = "+grandtotal);
	}
}

package com;

public class Pizza {

	public static void main(String[] args) {
		String type = "Regular";
		int price=149;
		boolean toping1=true;
		boolean toping2=true;
		boolean cheese=true;
		if(cheese==true) {
			price=price+80;
		}
		if(toping1==true) {
			price=price+40;
		}
		if(toping2==true) {
			price=price+75;
		}
		if(toping1==true && toping2==true) {
			price=price+40+75;
			System.out.println("You will get the free drink");
		}
		float gst=price*0.18f;
		float bill=price+gst;
		System.out.println(price);
		System.out.println(gst);
		System.out.println(bill);

	}}

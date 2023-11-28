package com;

public class Food {
	public static void main(String[] args) {
		String item = "Masala-Dosha";
		int qnty=2;
		int price=55;
		float totalprice= (qnty*price) + (qnty*price)*18.0f/100.0f;
		System.out.println(totalprice);
	}

}

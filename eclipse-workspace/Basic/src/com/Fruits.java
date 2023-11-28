package com;

public class Fruits {
	public static void main(String[] args) {
		String item="Appple";
		int priceperkg=250;
		int qntyingm=750;
		float totalprice=(priceperkg/1000.0f)*qntyingm ;
				// float paid = (totalprice) - (totalprice)*50.0f/100.0f; 
									//use this method for getting discount..
	//	System.out.println(paid);
		System.out.println(totalprice);
		
	}

}

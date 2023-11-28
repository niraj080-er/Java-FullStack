package com;

public class Shop {
	public static void main(String[] args) {
		int shirt=499;
		int jeans=999;
		int tshirt=399;
		int showes= 599;
		float totalamount= (shirt+jeans+tshirt+showes)- (shirt+jeans+tshirt+showes)*25.0f/100.0f;
		System.out.println(totalamount);
	}

}

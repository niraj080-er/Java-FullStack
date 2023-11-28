package com;

public class Discount {

	public static void main(String[] args) {
		int p1=  298;
		int p2=  456;
		int p4 = 899;
		int p5 = 979;
		int p6 = 699;
		int total = (p1+p2+p4+p4+p5+p6);
		System.out.println("The total amount = " +total);
		if(total>=3000) {
			float discount = total * 0.25f;
			float grandDiscount = total-discount;
			System.out.println("you have to pay total amount = " +grandDiscount);
		}else {
			System.out.println("you have to pay total amount = " +total);
		}
		
	}

}

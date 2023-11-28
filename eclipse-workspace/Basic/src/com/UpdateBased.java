package com;

public class UpdateBased {
	public static void main(String[] args) {
		int p1=  298;
		int p2=  456;
		int p4 = 899;
		int p5 = 979;
		int p6 = 699;
		float total = (p1+p2+p4+p4+p5+p6);
		System.out.println(total);
		float discount = total * 0.25f;
		total = total-discount;
		System.out.println(discount);
		System.out.println(total);
	}

}

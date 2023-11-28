package com;

public class Conditional2 {

	public static void main(String[] args) {
		
		int p1=999;
		int p2=349;
		int p3=399;
		int p4=599;
		float total = p1+p2+p3+p4;
		System.out.println("Total amount = " +total);
		if(total>=2000) {
			float discount=total*0.25f;
			float grandtotal=total-discount;
			System.out.println("Discount amountt = " +grandtotal);
		}
	}

}

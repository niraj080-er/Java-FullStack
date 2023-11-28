package com;

public class DiscountRecomendation {

	public static void main(String[] args) {
		int p1=  298;
		int p2=  456;
		int p4 = 899;
		int p5 = 979;

		double total = (p1+p2+p4+p4+p5);
		double discount=0;
		discount=total*0.10f;

		if(total>=1000 && total<=2000) {
			discount=total*0.20;
			System.out.println(2001-total + " Worth products must be added to get 25% discount. ");
			System.out.println(3001-total + " Worth products must be added to get 30% discount. ");
			System.out.println(4501-total + " Worth products must be added to get 40% discount. ");
		}
		if(total>=2001 && total<=3000) {
			discount=total*0.25f;
			System.out.println(3001-total +"Worth products must be added to get 30% discount. ");
			System.out.println(4501-total +"Worth products must be added to get 40% discount. ");	
		}
		if(total>=3001 && total<=4500) {
			discount=total*0.30f;
			System.out.println(4501-total + " Worth products must be added to get 40% discount. ");
		}
		if(total>4500) {
			discount=total*0.45f;
		}

		double bill=total-discount;
		System.out.println(total);
		System.out.println(discount);
		System.out.println(bill);

	}

}

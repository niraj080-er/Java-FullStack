package com;

public class ConditionalMedPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1=129;
		int p2=200;
		int p3=500;
		int p4=450;
		float total = p1+p2+p3+p4;
		float discount=total*0.10f;
		if(total>=999) {
			float discount1=total*0.20f;
			float total1= total-discount1;
			System.out.println(total1);
		}else {
		System.out.println(total);
		System.out.println(discount);
		total=total-discount;
		System.out.println(total);
		}

	}

}

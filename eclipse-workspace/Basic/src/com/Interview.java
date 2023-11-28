package com;

public class Interview {

	public static void main(String[] args) {
		int qcode=3;
		int scode=1;
		double per =64;
		int yop=2023;

		if((qcode==1 || qcode==3 || qcode==5) && (scode==1 || scode==2 || scode==5) && (yop>=2022 && yop<=2024) && (per>=55)){

			System.out.println("You are eligible for Inerview");
		}else {
			System.out.println("You are not eligible for interview");
			if(qcode!=1 && qcode!=3 && qcode!=5) {
				System.out.println("Qualification is not matching");
			}if(scode!=1 && scode!=2 && scode!=5) {
				System.out.println("Stram is not matching");
			}
			if(yop<2022 || yop>2024) {
				System.out.println("Year of passing is not matching");
			}
			if(per<55) {
				System.out.println("Percentage is not matching");
			}
		}

	}

}

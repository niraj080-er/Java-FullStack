package com;

public class Assignment1 {

	public static void main(String[] args) {
		int P= 44;
		int C=50;
		int M=60;
		int O=20;
		float total = P+C+M+O;
		float percentage = total/400.0f*100.0f;
		System.out.println("Marks of Physics = " +P);
		System.out.println("Marks of Chemistry = " +C);
		System.out.println("Marks of Math = " +M);
		System.out.println("Marks of Optional = " +O);
		if(P>34 && C>34 && M>34 && O>34 ) {

			System.out.println("Total marks of student = " +total);
			System.out.println("Total percentaage of student = " +percentage);
		}else {
			System.out.println("Any subject marks are less than 35 Percentage cannot be calculated ");
		}

	}

}

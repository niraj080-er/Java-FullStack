package com;

public class Assignment2 {
	public static void main(String[] args) {
		int P= 44;
		int C=50;
		int M=40;
		int O=40;
		float total = P+C+M+O;
		float percentage = total/400.0f*100.0f;
		if(P<34 || C<34 || M<34 || O<34)
		{	if(P<34) {
			System.out.println("You are failed in phycis");
		}
		if(C<34) {
			System.out.println("You are failed in chemistry");
		}
		if(M<34) {
			System.out.println("You are failed in math");
		}
		if(O<34) {
			System.out.println("You are failed in optional");
		}
		System.out.println("fail");
		}

		else {
			System.out.println("your total marks = "+total);
			System.out.println("Your percentage = "+percentage);
		}
	}

}

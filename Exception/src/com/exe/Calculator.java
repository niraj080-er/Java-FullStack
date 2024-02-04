package com.exe;

import java.util.Scanner;

public class Calculator {
	
	public void division(int numenitor , int dumenitor) {
		int res=0;
		try {
			res=numenitor/dumenitor;
		}
		catch (Exception e) {
			System.out.println("can not divided by zero");
			System.out.println("Denominator value must be non zero");
		}
		System.out.println("Result is Dividing "+ numenitor+" by "+dumenitor+" is "+ res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numerator value");
		int n=sc.nextInt();
		System.out.println("Enter the Dunoeminator value");
		int m=sc.nextInt();
		Calculator calci=new Calculator();
		calci.division(n, m);
	}

}

package com.exe;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int x=10;
		int y=0;
		int res=0;
		try {
			System.out.println("entered in try block");
			res=x/y;
			System.out.println("You exited from try blok");
					
		}catch(Exception exp) {
			System.out.println("inside the catch block");
			System.out.println("unable to divived by 0");
		}
	}

}

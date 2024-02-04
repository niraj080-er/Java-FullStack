package com.exe;

public class MainClass3 {
	public static void main(String[] args) {
		int x=10;
		int y=0;
		int res=0;
		int [] arr=new int[5];
		try {
			System.out.println("entered in outer try bloclk");
			
			try {
				System.out.println("enterd in inner tyr block");
				res=x/y;
				System.out.println("exit from iiner try block");
			}
			catch(ArithmeticException exp) {
				System.out.println("inside inner catch block");
				System.out.println("unable to divid by zero");
				System.out.println("exit from iiner catch block");
			}
			arr[9]=17;
			System.out.println("exti from otter catch block");
		}
		catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("enter in outter catch blok ");
			System.out.println("invalid index is there");
			System.out.println("exit from outter catch block");
		}
		System.out.println("The result is:" +res);
	}

}

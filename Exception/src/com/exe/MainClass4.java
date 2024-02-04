package com.exe;

public class MainClass4 {
	public static void main(String[] args) {
		ArithmeticException e1=new ArithmeticException();
		String msg=e1.getMessage();
		System.out.println(msg);
		e1.printStackTrace();
		System.out.println("----------------");
		ArithmeticException e2=new ArithmeticException("Niraj Kumar");
		String msg2=e2.getMessage();
		System.out.println(msg2);
		e2.printStackTrace();
		System.out.println();
	}

}

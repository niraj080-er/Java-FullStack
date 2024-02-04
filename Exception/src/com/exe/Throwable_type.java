package com.exe;

public class Throwable_type {
	public static void main(String[] args) {
		ArithmeticException e1=new ArithmeticException("Niraj Kumar");
		try {
			System.out.println("Enterd into rty block");
			throw e1;
		}catch(ArithmeticException exp) {
			System.out.println("Inside the catch block");
			System.out.println("Reason "+ exp.getMessage());
			exp.printStackTrace();
		}
		System.out.println("Mian Method ended");
	}

}

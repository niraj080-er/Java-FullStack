package com;

public class Withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance=75000;
		int amount=68000;
		int BankCode=2;
		System.out.println("Balance before the withdraw = "+ balance);
		System.out.println("Withdraw Amount = "+amount );
		
		if(balance<=100000) {
			balance=balance-amount;
			System.out.println("Balance after withdraw =" +balance);
			
		}
		if(BankCode==2 || BankCode==4) {
			if(balance<10000) {
				System.out.println("Low-Balance");
				System.out.println(10000-balance +" Must be deposite ");
			}
		}else {
			System.out.println("You have not sufficient Balance");
		}
	}

}

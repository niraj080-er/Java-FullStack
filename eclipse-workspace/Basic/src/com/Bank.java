package com;

public class Bank {

	public static void main(String[] args) {
		int balance = 86000;
		int amount= 500000;
		// int withdraw= balance-amount;
		System.out.println("Available balance = " +balance);
		System.out.println("Withdraw amount = " +amount);
		if(amount<=balance) {
			amount=balance-amount;
			System.out.println("Total available Balance = "+amount);
		}
		else
		{
			System.out.println("You have not sufficient Balance");
		}
	}
}

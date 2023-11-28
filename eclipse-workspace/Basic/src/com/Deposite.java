package com;

public class Deposite {

	public static void main(String[] args) {

		int balance=75000;
		int amount =80000;
		boolean pancard=false;
		if(amount > 100000) {
			if(pancard==true) {
				balance=balance+amount;
				System.out.println("Your current balance = "+balance);
			}
			else {
				System.out.println("You have to link your pancard");
			}
		}
		else {
			balance=balance+amount;
			System.out.println("Your current balance = "+balance);
		}

	}
}

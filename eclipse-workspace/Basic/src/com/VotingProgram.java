package com;

public class VotingProgram {

	public static void main(String[] args) {
		int age = 18;
		boolean voterId = false;
		if(age >=18) {
			if(voterId==true) {
				System.out.println("Eligible for voting");
			}
			else {
				System.out.println("You are not eligible for vote");
				System.out.println("No-voterId");
			}
		}else {
			System.out.println("You are not eligible for vote");
			
		}

	}

}

package com;

public class Range {

	public static void main(String[] args) {
		int p=66; int c=56; int m=82; int o=84;
		float total=p+c+m+o;
		float perc=total/4.0f;
		
		if(perc>=35 && perc<=59) {
			System.out.println("Second - Class");
		
		}
		if(perc>=60 && perc<=79) {
			System.out.println("First-Class");
		}
		if(perc>=79) {
			System.out.println("Distinct-class");
		}
	}

}

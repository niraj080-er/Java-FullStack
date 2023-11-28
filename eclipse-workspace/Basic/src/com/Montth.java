package com;

public class Montth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =3;
		if(month ==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println("The numbers of day is 31");
		}
		if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("The numbers of the is 30");
		}
		if(month==2) {
			System.out.println("The number of the day is 28/29");
		}

	}

}

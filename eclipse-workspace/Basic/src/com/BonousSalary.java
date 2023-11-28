package com;

public class BonousSalary {

	public static void main(String[] args) {
		String EmpName="Niraj"; String CompanyName="Oracle";  int sal = 150000;  double service=2.3;
		double bonous=0; double totalsal=0;
	
	// service slab 
		if(service<=1.5) {
			bonous = sal*0.10f;
		}
		if(service<=1.6 || service>=2) {
			bonous = sal*0.15f;
		}
		if(service<=3 || service>4) {
			bonous = sal*0.25f;
		}
		if(service<=4 || service >=5) {
			bonous = sal*0.35f;
		}
		if(service<5) {
			bonous = sal*0.50f;
		}
		totalsal=sal+bonous;
		System.out.println("Name of the employee = "+EmpName);
		System.out.println("Name of the company = " +CompanyName);
		System.out.println("Employee salary = "+sal);
		System.out.println("Emplyee experience in year = "+service);
		System.out.println("Employee bonous = "+bonous);
		System.out.println("Employee total salary inculiding bonous = "+totalsal);
	}

}

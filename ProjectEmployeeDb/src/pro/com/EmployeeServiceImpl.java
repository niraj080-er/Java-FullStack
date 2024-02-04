package pro.com;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
	Employee [] eDB;
	Scanner ip=new Scanner(System.in);
	@Override
	public void createEmployeeDb(int size) {
		eDB=new Employee[size];
		System.out.println("Employee Db had been created with the size " +size);

	}
	@Override
	public void availableIndex() {
		int c=0;
		System.out.println("=====Available Index=====");
		for (int i = 0; i < eDB.length; i++) {
			if(eDB[i]==null) {
				System.out.print(i+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.print("DataBase is full");
		}
		System.out.println();
	}
	@Override
	public void addEmployee(int in) {
		if(in>=eDB.length) {
			System.out.println("Invalid Index Number");
		}
		else if(eDB[in]!=null) {
			System.out.println("Its already occupied");
		}
		else {
			System.out.println("Enter the Employee Id");
			int eid=ip.nextInt();
			System.out.println("Enter the Name of Employee");
			String name=ip.next();
			System.out.println("Enter the Employee Desination");
			String desgn=ip.next();
			System.out.println("Enter the Employee salary");
			double sal=ip.nextDouble();
			System.out.println("Enter the Employee age");
			int age=ip.nextInt();
			eDB[in]=new Employee(eid, name, desgn, sal, age);
			System.out.println("Employee had been successfully Added");
		}

	}
	@Override
	public void displayAllEmp() {
		System.out.println("====Employee--Details====");
		int c=0;
		for (int i = 0; i < eDB.length; i++) {
			if(eDB[i]!=null) {
				System.out.println(eDB[i]);
				c++;
			}
		}
		if(c==0) {
			System.out.println("Data base is empty");
		}

	}

	@Override
	public void getEmployeeEid(int eid) {
		System.out.println("===Employee-by-Eid");
		int c=0;
		for(Employee ele:eDB) {
			if(ele!=null) {
				if(ele.getEid()==eid) {
					System.out.println(ele);
					c++;
					break;
				}
			}
		}
		if(c==0) {
			System.out.println("Eid Not Found....!!!!");
		}
	}
	@Override
	public void getEmployeeDetailsByDesg(String desgn) {
		System.out.println("====Employee Details by Designation====");
		boolean ans=false;
		for(Employee ele:eDB) {
			if(ele!=null) {
				if(ele.getDesgn().equalsIgnoreCase(desgn)) {
					System.out.println(ele);
					ans=true;
				}
			}
		}		
		if(ans==false) {
			System.out.println("Invalid Designation");
		}
	}
}

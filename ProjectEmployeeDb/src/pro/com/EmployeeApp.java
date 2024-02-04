package pro.com;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		EmployeeService e=new EmployeeServiceImpl();
		System.out.println("Welcome to Employee DB");
		while(true) {
			System.out.println("=====MENU=====");
			System.out.println("1.Create Employee-Db \n2.Available Index \n3.Add Employee \n4.Get Employee Details \n5.Get Employee-Details By Id:- \n6.Get Employee-Details by Designation \n7.Exit");
			System.out.println("Enter your Option");
			int op=ip.nextInt();
			switch(op) {
			case 1: System.out.println("Enter the size of DB");
				int size=ip.nextInt();
				e.createEmployeeDb(size);
				break;
			case 2:e.availableIndex();
			break;
			case 3:System.out.println("Enter the index Number");
			int in=ip.nextInt();
			e.addEmployee(in);
			break;
			case 4:e.displayAllEmp();break;
			case 5:System.out.println("Enter the Employe Id");
					int eid=ip.nextInt();
					e.getEmployeeEid(eid);
					break;
			case 6:System.out.println("Enter the employee Desgination");
			        String desn=ip.nextLine();
			        e.getEmployeeDetailsByDesg(desn);
			        break;
			case 7: System.out.println("====Thank You Visit Againn====");
			System.exit(1);
			break;
			default:System.out.println("Invalid Option");
			}
		}
		
				
	}
}

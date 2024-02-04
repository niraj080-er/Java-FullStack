package jspider.com.p1;

public class EmployeeMainClass1 {
	public static void main(String[] args) {
		Employee obj1= new Employee(123,"Niraj",3460.339);
		System.out.println("Employee ID: " +obj1.getId());
		System.out.println("Employee Name: " +obj1.getName());
		System.out.println("Employee salary: " +obj1.getSal());
		System.out.println("===============");
		System.out.println("Update the Employee Details");
		obj1.setId(234);
		obj1.setName("Priyanshu");
		obj1.setSal(560000.89);
		System.out.println("Employee ID: " +obj1.getId());
		System.out.println("Employee Name: " +obj1.getName());
		System.out.println("Employee salary: " +obj1.getSal());
		
		
	}

}
package jsp;

import java.util.ArrayList;

public class Only_Employee_Object {
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>(); // Only employee type object will add because it is the generic
		emp.add(new Employee(1233, "Niraj", "ASE", 9602000.0));
		emp.add(new Employee(1233, "Niraj", "ASE", 9602000.0));
		emp.add(new Employee(1234, "Pri", "ASE", 5680000.0));
		emp.add(new Employee(1235, "Kushw", "ASE", 5260000.0));
		emp.add(new Employee(1236, "Pankaj", "ASE", 5600200.0));
		emp.add(new Employee(1238, "Adarsh", "ASE", 5600200.0));
		emp.add(new Employee(1239, "HArsh", "ASE", 5260000.0));
		emp.add(new Employee(1240, "Ramesh", "ASE", 5620000.0));
		emp.add(new Employee(1241, "Rahul", "ASE", 5620000.0));
		emp.add(new Employee(1242, "Aryan", "ASE", 5600100.0));
		emp.add(new Employee(1243, "Anshul", "ASE", 5620000.0));
		emp.add(new Employee(1244, "Atul", "ASE", 5601000.0));
		emp.add(new Employee(1245, "Utkla", "ASE", 5609000.0));
		emp.add(new Employee(1246, "Aashis", "ASE", 5602000.0));
		emp.add(new Employee(1247, "Babar", "ASE", 5670000.0));
		
		System.out.println("Employee Details: "+emp.size());
		System.out.println("-------------------------------");
		System.out.println("ID\tName\tSalary");
		for (Employee employee :emp) {
			System.out.println(employee.Id+"\t"+employee.Name+"\t"+employee.Dedignation+"\t"+employee.salary);
		}
		
	}

}

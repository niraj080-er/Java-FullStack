package jsp;
public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1=new Employee(1233, "Niraj", "ASE", 9602000.0);
		Employee e2=new Employee(1234, "Pri", "ASE", 5680000.0);
		Employee e3=new Employee(1235, "Kushw", "ASE", 5260000.0);
		Employee e4=new Employee(1236, "Pankaj", "ASE", 5600200.0);
		Employee e5=new Employee(1238, "Adarsh", "ASE", 5600200.0);
		Employee e6=new Employee(1239, "HArsh", "ASE", 5260000.0);
		Employee e7=new Employee(1240, "Ramesh", "ASE", 5620000.0);
		Employee e8=new Employee(1241, "Rahul", "ASE", 5620000.0);
		Employee e9=new Employee(1242, "Aryan", "ASE", 5600100.0);
		Employee e10=new Employee(1243, "Anshul", "ASE", 5620000.0);
		Employee e11=new Employee(1244, "Atul", "ASE", 5601000.0);
		Employee e12=new Employee(1245, "Utkla", "ASE", 5609000.0);
		Employee e13=new Employee(1246, "Aashis", "ASE", 5602000.0);
		Employee e14=new Employee(1247, "Babar", "ASE", 5670000.0);
		
		Employee[] emparr=new Employee[14];
		emparr[0]=e1;
		emparr[1]=e2;
		emparr[2]=e3;
		emparr[3]=e4;
		emparr[4]=e5;
		emparr[5]=e6;
		emparr[6]=e7;
		emparr[7]=e8;
		emparr[8]=e9;
		emparr[9]=e10;
		emparr[10]=e11;
		emparr[11]=e12;
		emparr[12]=e13;
		emparr[13]=e14;
		System.out.println("Employee Details --> Using Employee Class");
		System.out.println("---------------------------------");
		System.out.println("ID\tName\tSalary");
		for (Employee employee : emparr) {
			System.out.println(employee.Id+"\t"+employee.Name+"\t"+employee.Dedignation+"\t"+employee.salary);

		}
		System.out.println("---------------------------------");
		Object[] arr=new Object[14]; 
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		arr[3]=e4;
		arr[4]=e5;
		arr[5]=e6;
		arr[6]=e7;
		arr[7]=e8;
		arr[8]=e9;
		arr[9]=e10;
		arr[10]=e11;
		arr[11]=e12;
		arr[12]=e13;
		arr[13]=e1;
		System.out.println("Employee Details --> Using Object Class");
		System.out.println("---------------------------------");
		System.out.println("ID\tName\tSalary");
		for (Object employee :arr) {
			Employee employee1=(Employee)employee;
			System.out.println(employee1.Id+"\t"+employee1.Name+"\t"+employee1.Dedignation+"\t"+employee1.salary);
		}
		System.out.println("---------------------------------");
	}
}

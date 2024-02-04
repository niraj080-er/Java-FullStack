package jsp;

public class Employee {
	Integer Id;
	String Name;
	String Dedignation;
	Double salary;
	public Employee(Integer id, String name, String dedignation, Double salary) {
		super();
		Id = id;
		Name = name;
		Dedignation = dedignation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Dedignation=" + Dedignation + ", salary=" + salary + "]";
	}
}

package jsp;

public class Student {
	Integer Id;
	String studenName;
	Double marks;
	public Student(Integer id, String studenName, Double marks) {
		super();
		Id = id;
		this.studenName = studenName;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", studenName=" + studenName + ", marks=" + marks + "]";
	}
	
	

}

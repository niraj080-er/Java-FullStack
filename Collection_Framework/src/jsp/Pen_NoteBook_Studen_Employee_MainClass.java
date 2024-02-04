package jsp;

import java.util.ArrayList;
public class Pen_NoteBook_Studen_Employee_MainClass {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(new Pen("cello", "Black", 10.00));
		l1.add(new NoteBook("classmate", 50.55, 100));
		l1.add(new Student(111, "Niraj", 88.0));
		l1.add(new Employee(123, "Priyanshu", "SFV", 100000.0));
		System.out.println("The size of the ArrayList "+l1.size());
//		System.out.println(l1);
		for (Object object : l1) {
			System.out.println(object);
		}
	}

}

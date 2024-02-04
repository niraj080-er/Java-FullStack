package polymarphism.com;

class Person{
	public  void niraj(String home) {
		System.out.println("Behave like Son ");
	}
	public  void niraj(int jsp) {
		System.out.println("Behave like Student");
	}
	public  void niraj(double bar) {
		System.out.println("Behave like Customer");
	}
}
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.niraj("Niraj Kumar");
		p1.niraj(5);
		p1.niraj(5.5);
		
	}

}

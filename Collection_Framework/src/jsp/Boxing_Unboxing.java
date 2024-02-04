package jsp;

public class Boxing_Unboxing {
	public static void main(String[] args) {
		// Boxing
		Integer a=new Integer(100);
		Double d=new Double(10.5);
		System.out.println(a);
		System.out.println(d);

		// Unboxing
		int n1=a.intValue();
		double d2=d.doubleValue();
		System.out.println(n1);
		System.out.println(d2);
		
		Integer num1=10;  // num1 and num2 are auto unboxnig 
		Integer num2=20; 
		Integer sum=num1+num2; // adding is performed
		System.out.println("The result of the to Integer = "+sum); // result is autoboxed to Integer
		
	}

}

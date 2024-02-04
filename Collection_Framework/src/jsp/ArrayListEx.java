package jsp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx  {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("Number of Element in the arrayList = " +a1.size());
		System.out.println("If array is empty then true else false = "+a1.isEmpty());
		a1.add("JPMC");
		a1.add(2);
		a1.add(6);
		a1.add("Nirja");
		a1.add("developer");
		a1.add(true);
		a1.add(false);
		a1.add(null);
		a1.add("java");
		System.out.println("---------------------------");
		System.out.println(a1);
		System.out.println("Number of Element in the arrayList = " +a1.size());
		System.out.println("If array is empty then true else false = "+a1.isEmpty());
		System.out.println("ArrayList accesing the element @ zero index");
		System.out.println("The first element of the arrayList on Zero index = "+a1.get(0));
//		int value=(int) a1.get(2);
//		System.out.println(value);
		System.out.println("==================================");
		for(Object ele:a1) {
			System.out.println(ele);
		}
		System.out.println("==================================");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
			
		}
		
	}
}

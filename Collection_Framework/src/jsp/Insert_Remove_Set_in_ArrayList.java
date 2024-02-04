package jsp;

import java.util.ArrayList;

public class Insert_Remove_Set_in_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		arr1.add(99);
		arr1.add(809);
		arr1.add(919);
		arr1.add(892);
		arr1.add(993);
		arr1.add(892);
		arr1.add(990);
		arr1.add(892);
		arr1.add(992);
		System.out.println("List Element");
		System.out.println(arr1);
		System.out.println("Insert @  zero index to 200");
		arr1.add(0,200);
		System.out.println(arr1);
		System.out.println("Removing element @ 3 index");
		arr1.remove(3);
		System.out.println(arr1);
		System.out.println("Replace the element with new Eleemnt");
		arr1.set(2, 1000);
		System.out.println(arr1);
	}

}

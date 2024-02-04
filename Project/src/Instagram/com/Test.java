package Instagram.com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Demo obj1= new Demo();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("entre 1 to resize the photo ");
			System.out.println("enter 2 for crop");
			System.out.println("enter 3 for filter ");
			System.out.println("entre 4 for post");
			int n=sc.nextInt();
			
			
		switch(n)
		{
		case 1:
			Demo.resize();
			break;
		case 2:
			Demo.crop();
			break;
		case 3:
			Demo.addFile();
			break;
		case 4:
			Demo.post();
			break;
			default:
				System.out.println("u entered invalid choice   ");
		}
				System.out.println("do u want to try again");
				String s=sc.next();
				//if(s.equalsIgnoreCase("no")&&(!(s.equals("yes"))))
				if(!(s.equals("yes")))
					break;
		}
		System.out.println("----------thank u---------");
	}
}

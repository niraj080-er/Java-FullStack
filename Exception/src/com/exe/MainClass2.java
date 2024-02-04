package com.exe;

public class MainClass2 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		try {
			System.out.println("enterd in try block");
			arr[1]=10;
			arr[2]=100;
			arr[3]=110;
			arr[7]=00;
			System.out.println("exit from the try block");
		}
		catch(Exception exp) {
			System.out.println("entred in catch block ");
			System.out.println("invalid index number");
		}
		for(int ele:arr) {
			System.out.println(ele);
		}
	}

}

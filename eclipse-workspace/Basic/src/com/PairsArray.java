package com;

public class PairsArray {

	public static void Pairs(int numbers[] ) {
		for(int i=0; i<numbers.length; i++) {
			int curr = numbers[i];
			for (int j=i+1; j<numbers.length; j++) {
				System.out.print(curr);
				// System.out.print("("+curr+","+numbers[j]+")");
				// using this printline I can get output like 
				// (4,6)(4,8)(4,9)
				// (6,8)(6,9)
				// (8,9)

				System.out.print(numbers[j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int numbers []= {4,6,8,9};
		Pairs(numbers);

	}

}

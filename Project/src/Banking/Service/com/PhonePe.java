package Banking.Service.com;

import java.util.Scanner;

import BankingApp.com.*;

public class PhonePe implements BankUser {
	Account a1;
	Transaction t1;
	
	public PhonePe(Account a1, Transaction t1) {
		super();
		this.a1 = a1;
		this.t1 = t1;
	}

	@Override
	public void transfer(){
		Scanner sc=new Scanner(System.in);
		String runagian  ;
		do {
		System.out.println("<<< Welcome to PhonePe >>> ");
		System.out.println("Enter your choice 1.Receive  2.Send ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter your  Ammount ");
			int amt=sc.nextInt();
			t1.deposite(amt, a1);
		}
		else if(choice==2) {
			System.out.println("Enter your  amount ");
			int withAmt=sc.nextInt();
			t1.withdraw(withAmt, a1);
		}
		
		else {
			System.out.println("Invalid choice");
		}
		System.out.println("Do you want try again type yes");
		sc.nextLine();
		runagian=sc.nextLine();
		}
		while(runagian.equalsIgnoreCase("yes"));
	
	}
}

package Banking.SignUp.com;
import java.util.Scanner;
import Banking.Service.com.*;
import BankingApp.com.*;

public class User {
	String Id;
	String Pasw;
	public void signUp(Account a1, Transaction t1) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter your email Id ");
		String id=ip.nextLine();
		System.out.println("Enter Your Password ");
		String pasw=ip.nextLine();
		System.out.println("SingnUp SuccesFul ");
		this.Id=id;
		this.Pasw=pasw;
	}
	public BankUser login(Account a1, Transaction t1) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter your email Id ");
		String id=ip.nextLine();
		System.out.println("Enter Your Password ");
		String pasw=ip.nextLine();
		if(id.equals(Id)&& pasw.equals(Pasw)) {
			System.out.println("Login SuccessFull");

			System.out.println("Enter your choice 1.ATM 2.PhonePe 3.GPay ");
			int choice = ip.nextInt();
			switch(choice) {
			case 1: 
				BankUser atm1= new ATM(a1,t1);
				return atm1;	
			case 2:
				BankUser phonepe = new PhonePe(a1, t1);
				return phonepe;
			case 3:
				BankUser gpay=new GPay(a1, t1);
				return gpay;
			default:
				System.out.println("Invalid choice");
			}
		}
		 else 
		{
			System.out.println("Invalid user id and Password");
		}
		return null;
	}
	public static void main(String[] args) {
		BankUser b1;
		System.out.println("Welcome to Banking App");
		Account a1=new Account("Niraj Kumar",12345,0);
		Transaction t1=new Transaction();
		User user1=new User();
		user1.signUp(a1, t1);
		b1=user1.login(a1, t1);
		b1.transfer();
		t1.checkBalance(a1);

	}

}

package Abstraction.jsp.com;
class Acccount {
	long accno;
	String ifsc;
	double bal;
	String branch;
	public Acccount(long accno, String ifsc, double bal, String branch) {
		super();
		this.accno = accno;
		this.ifsc = ifsc;
		this.bal = bal;
		this.branch = branch;
	}
	public void deposite(double amt) {
		if(amt>=0) {
			bal=bal+amt;
			System.out.println(" deposite succesfull :" +amt + " current amount : " + bal);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amt) {
		if(amt>=0 && bal>=amt) {
			bal=bal-amt;
			System.out.println(" withdraw succesfull :" +amt + " current amount : " + bal);
		}
		else {
			System.out.println("insufficient  balance");
		}
	}
}
class Customer{
	String name;
	String email;
	long phoneno;
	Acccount a1;
	public Customer(String name, String email, long phoneno, Acccount a1) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.a1 = a1;
	}
	public void depositeaccount(double amt) {
		a1.deposite(amt);
	}
	public void withdrawfroAccount(double amt) {
		a1.withdraw(amt);
	}
}
public class BankMain {
	public static void main(String[] args) {
		Acccount a1= new Acccount(163425, "sbin0014292", 1000, "btm");
		Customer c1=new Customer("niraj", "Niraj@gmail.com", 62804580L, a1);
		c1.depositeaccount(1200);
		c1.withdrawfroAccount(1000);

	}

}

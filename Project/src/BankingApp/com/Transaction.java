package BankingApp.com;

public class Transaction {
	public void deposite (double amt, Account a1) {
		if(amt>=0) {
			a1.setBal(a1.getBal()+amt);
			checkBalance(a1);

		}
		else {
			System.out.println("Invalid Balance ");
		}

	}
	public void withdraw(double amt , Account a1) {
		if(amt>=0 && a1.getBal()>=amt) {
			a1.setBal(a1.getBal()-amt);
			checkBalance(a1);
		}
		else {
			System.out.println("Insufficient Balance ");
		}
	}
	public void checkBalance(Account a1) {
		System.out.println("User Name: " +a1.getName()+  " Current Balance = " + a1.getBal());
	}

}


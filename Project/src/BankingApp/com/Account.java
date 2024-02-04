package BankingApp.com;

public class Account {
	private String name;
	private long accountNumber;
	private double bal;
	public Account(String name, long accountNumber, double bal) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
}

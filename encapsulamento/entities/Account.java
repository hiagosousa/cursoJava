package entities;

public class Account {

	private int accountNumber;
	private String name;
	private double accountTotal;

	public Account(int accountNumber, String name, double firstDeposit) {

		this.accountNumber = accountNumber;
		this.name = name;
		deposit(firstDeposit);
	}

	public Account(int accountNumber, String name) {

		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountTotal() {
		return accountTotal;
	}

	public double deposit(double valor) {
		this.accountTotal += valor;
		return this.accountTotal;
	}

	public double withdraw(double valor) {
		this.accountTotal -= valor + 5.0;
		return this.accountTotal;
	}

	public String toString() {
		return "Conta " + accountNumber + ", Titular: " + name + ", Balanço: $" + String.format("%.2f", accountTotal);
	}

}

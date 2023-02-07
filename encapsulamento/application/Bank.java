package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		double value;
		
		System.out.println("Digite o numero da conta");
		int accountNumber = sc.nextInt();
		System.out.println("Digite o dono da conta");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Havera um deposito inicial? (s/n)");
		char depositCondition = sc.next().charAt(0);
		if(depositCondition == 's' || depositCondition == 'S') {
			System.out.println("Digite o valor do deposito inicial");
			double firstDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, firstDeposit);
		}else {
			account = new Account(accountNumber, name);
		}
		System.out.println("\nDados da conta:\n");
		System.out.println(account);
		
		System.out.println("\nDigite o valor do Deposito:");
		value = sc.nextDouble();
		account.deposit(value);
		System.out.println(account);
		
		System.out.println("\nDigite o valor do Saque:");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println(account);
		
		sc.close();
	}

}

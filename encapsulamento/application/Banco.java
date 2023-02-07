package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		double valor;
		
		System.out.println("Digite o numero da conta");
		int numConta = sc.nextInt();
		System.out.println("Digite o dono da conta");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Havera um deposito inicial? (s/n)");
		char haveraDeposito = sc.next().charAt(0);
		if(haveraDeposito == 's' || haveraDeposito == 'S') {
			System.out.println("Digite o valor do deposito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, depositoInicial);
		}else {
			conta = new Conta(numConta, nomeTitular);
		}
		System.out.println("\nDados da conta:\n");
		System.out.println(conta);
		
		System.out.println("\nDigite o valor do Deposito:");
		valor = sc.nextDouble();
		conta.fazerDeposito(valor);
		System.out.println(conta);
		
		System.out.println("\nDigite o valor do Saque:");
		valor = sc.nextDouble();
		conta.fazerSaque(valor);
		System.out.println(conta);
		
		sc.close();
	}

}

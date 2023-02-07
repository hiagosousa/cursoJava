package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Worker worker = new Worker();

		System.out.println("Digite os valores: \n");
		worker.name = sc.nextLine();
		worker.grossSalary = sc.nextDouble();
		worker.imposto = sc.nextDouble();

		System.out.println(worker);
		System.out.println("Digite a porcentagem a se aumentar: ");

		double porcentagem = sc.nextDouble();
		worker.aumentarSalario(porcentagem);
		System.out.println(worker);

		sc.close();
	}

}

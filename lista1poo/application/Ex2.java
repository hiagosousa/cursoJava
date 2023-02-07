package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Trabalhador;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Trabalhador trabalhador = new Trabalhador();

		System.out.println("Digite os valores: \n");
		trabalhador.nome = sc.nextLine();
		trabalhador.salarioBruto = sc.nextDouble();
		trabalhador.imposto = sc.nextDouble();

		System.out.println(trabalhador);
		System.out.println("Digite a porcentagem a se aumentar: ");

		double porcentagem = sc.nextDouble();
		trabalhador.aumentarSalario(porcentagem);
		System.out.println(trabalhador);

		sc.close();
	}

}

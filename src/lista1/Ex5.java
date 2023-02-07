package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int codigoPeca1;
		int codigoPeca2;
		int quantidadePeca1;
		int quantidadePeca2;
		double valorPeca1;
		double valorPeca2;
		double valorTotal;

		Scanner sc = new Scanner(System.in);

		codigoPeca1 = sc.nextInt();		
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();		
		valorPeca2 = sc.nextDouble();

		valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f",valorTotal);
		
		sc.close();

	}

}

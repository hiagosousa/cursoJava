package lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int valor;

		valor = sc.nextInt();

		if (valor < 0) {
			System.out.println("NEGATIVO");

		} else
			System.out.println("NÃO NEGATIVO");

		sc.close();

	}

}

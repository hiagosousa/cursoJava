package lista2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor;

		valor = sc.nextInt();
		
		if(valor%2 != 0) {
			System.out.println("IMPAR");
		}
		else {
			System.out.println("PAR");
		}

		sc.close();
	}

}

package lista2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		if(valor1%valor2 == 0) {
			System.out.println("Sao Multiplos");
		}
		else if(valor2%valor1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else System.out.println("Nao sao Multiplos");
		
		sc.close();
	}

}

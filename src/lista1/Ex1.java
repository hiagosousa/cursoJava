package lista1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int variavel1;
		int variavel2;
		Scanner sc = new Scanner(System.in);
		
		variavel1 = sc.nextInt();
		variavel2 = sc.nextInt();
		
		System.out.println("SOMA = " + (variavel1 + variavel2)+ " ");
		sc.close();

	}

}

package lista1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		int D;

		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		System.out.println("DIFERENCA = " + (A * B - C * D));

		sc.close();
	}

}

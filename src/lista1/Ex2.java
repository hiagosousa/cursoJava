package lista1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		double raio;
		double areaDoCirculo;

		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();

		areaDoCirculo = Math.PI * raio * raio;

		System.out.println("A = " + areaDoCirculo);
		sc.close();

	}

}

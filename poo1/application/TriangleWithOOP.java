package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class TriangleWithOOP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite os valores do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaDeX = x.areaDoTriangulo();
		double areaDeY = y.areaDoTriangulo();

		System.out.printf("Area do triangulo X: %.4f\n", areaDeX);
		System.out.printf("Area do triangulo Y: %.4f\n", areaDeY);

		if (areaDeX > areaDeY) {
			System.out.println("X eh a maior area");
		} else {
			System.out.println("Y eh a maior area");
		}
		sc.close();

	}

}

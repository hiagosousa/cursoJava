package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", retangulo.area()));
		System.out.println("PERIMETRO = " + String.format("%.2f", retangulo.perimetro()));
		System.out.println("DIAGONAL = " + String.format("%.2f", retangulo.diagonal()));
		
		sc.close();
	}

}

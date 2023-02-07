package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A;
		double B;
		double C;
		
		
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangulo = (A * C)/2;
		double circulo = Math.pow(C, 2) *Math.PI;
		double trapezio = ((A + B)*C)/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f",triangulo,circulo,trapezio,quadrado,retangulo);
		
		sc.close();
		
		
	}

}

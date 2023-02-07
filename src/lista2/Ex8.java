package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario,resultado;
		
		salario = sc.nextDouble();
		
		
		
		if(salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if(salario > 2000.00 && salario <= 3000.00) {
			resultado = ((salario - 2000)/100)*8;
			System.out.printf("R$ %.2f",resultado);
		} else if(salario > 3000.00 && salario <= 4500.00) {
			resultado = (((1000)/100)*8) + ((salario - 3000)/100)*18;
			System.out.printf("R$ %.2f",resultado);
		} else if(salario > 4500) {
			resultado = (((1000)/100)*8) + ((1500)/100)*18 + ((salario-4500)/100)*28;
			System.out.printf("R$ %.2f",resultado);
		}
		sc.close();
	}

}

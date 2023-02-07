package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value;
		double result;
		
		value = sc.nextDouble();
		
		result = CurrencyConverter.conversion(value);
		
		System.out.println(result);
		
		sc.close();

	}

}

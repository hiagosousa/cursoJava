package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Questionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de pessoas a serem adicionadas:");
		int quantity = sc.nextInt();
		sc.nextLine();
		Person[] person = new Person[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.println("Altura da " + (i + 1) + "a pessoa:");
			double height = sc.nextDouble();
			System.out.println("Genero da " + (i + 1) + "a pessoa:");
			char gender = sc.next().charAt(0);
			person[i] = new Person(height, gender);
		}
		double shorter = person[0].getheight(), taller = person[0].getheight(), sum = 0.0;
		int manCounter = 0, womanCounter = 0;
		
		for (int i = 0; i < quantity; i++) {

			if (person[i].getheight() < shorter) {
				shorter = person[i].getheight();
			}
			if (person[i].getheight() > taller) {
				taller = person[i].getheight();
			}
			if (person[i].getgender() == 'F' || person[i].getgender() == 'f') {
				sum += person[i].getheight();
				womanCounter++;
			}
			if (person[i].getgender() == 'M' || person[i].getgender() == 'm') {
				manCounter++;
			}
		}
		System.out.println("Menor altura = " + shorter + "\nMaior altura = " + taller);
		if(sum > 0) {
			System.out.println("Media de altura: Mulheres = " + (sum/womanCounter));
		}
		System.out.println("Quantidade de homens = " +manCounter);
		
		sc.close();
	}

}

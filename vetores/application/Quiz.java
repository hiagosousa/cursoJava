package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Quiz {

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
		double shorter = person[0].getHeight(), taller = person[0].getHeight(), sum = 0.0;
		int manCounter = 0, womanCounter = 0;
		
		for (int i = 0; i < quantity; i++) {

			if (person[i].getHeight() < shorter) {
				shorter = person[i].getHeight();
			}
			if (person[i].getHeight() > taller) {
				taller = person[i].getHeight();
			}
			if (person[i].getGender() == 'F' || person[i].getGender() == 'f') {
				sum += person[i].getHeight();
				womanCounter++;
			}
			if (person[i].getGender() == 'M' || person[i].getGender() == 'm') {
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

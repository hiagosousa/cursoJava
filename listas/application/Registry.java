package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Registry {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> employees = new ArrayList<>();

		System.out.println("Quantos funcionários serão registrados?");
		int amount = sc.nextInt();

		for (int i = 0; i < amount; i++) {

			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.println("Id:");
			Integer id = sc.nextInt();
			while(idInUse(employees, id)) {
				System.out.println("Id atualmente em uso! Digite outro:");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.println("Nome:");
			String name = sc.nextLine();
			System.out.println("Salario:");
			Double salary = sc.nextDouble();

			Employees emp = new Employees(id, name, salary);

			employees.add(emp);
		}
		System.out.println("Prefere fazer do Metodo 1, 2, 3?");
		int method = sc.nextInt();

		if (method == 1) {
			System.out.println("Digite o Id do usuario a ter o salario aumentado:");
			int chosenId = sc.nextInt();
			Integer idLocation = null;

			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).getId() == chosenId) {
					idLocation = i;
				}
			}
			if (idLocation == null) {
				System.out.println("Id invalido!");
			} else {
				System.out.println("Digite a porcentagem a ser adicionada:");
				double percentage = sc.nextDouble();
				employees.get(idLocation).increaseSalary(percentage);
			}

		} else if (method == 2) {
			System.out.println("Digite o Id do usuario a ter o salario aumentado:");
			int chosenId = sc.nextInt();
			Integer idLocation = findId(employees, chosenId);
			if (idLocation == null) {
				System.out.println("Id invalido!");
			} else {
				System.out.println("Digite a porcentagem a ser adicionada:");
				double percentage = sc.nextDouble();
				employees.get(idLocation).increaseSalary(percentage);
			}

		} else if (method == 3) {
			System.out.println("Digite o Id do usuario a ter o salario aumentado:");
			int chosenId = sc.nextInt();
			Employees searcher = employees.stream().filter(condition -> condition.getId() == chosenId).findFirst().orElse(null);
			if (searcher == null) {
				System.out.println("Id invalido!");
			} else {
				System.out.println("Digite a porcentagem a ser adicionada:");
				double percentage = sc.nextDouble();
				searcher.increaseSalary(percentage);
			}
			
			
		}
		System.out.println("Lista de funcionarios:");
		for (Employees condition : employees) {
			System.out.println(condition);
		}

		sc.close();
	}

	public static Integer findId(List<Employees> employees, int id) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	public static boolean idInUse(List<Employees> employees, int id) {
		Employees searcher = employees.stream().filter(condition -> condition.getId() == id).findFirst().orElse(null);
		return searcher != null;
	}
}

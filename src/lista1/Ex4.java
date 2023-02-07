package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int numeroDoFuncionario;
		int horasTrabalhadas;
		double salarioPorHora;
		double salario;

		Scanner sc = new Scanner(System.in);
		numeroDoFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salarioPorHora = sc.nextDouble();
		salario = horasTrabalhadas * salarioPorHora;
		
		sc.close();
		
		System.out.printf("NUMBER = " + numeroDoFuncionario + "\nSALARY = U$ " + "%.2f",salario);

	}
}

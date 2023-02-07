package lista2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracao;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaInicial > horaFinal) {
			duracao = 24 - horaInicial + horaFinal;
		} else if (horaInicial == horaFinal) {
			duracao = 24;
		} else
			duracao = horaInicial - horaFinal;

		sc.close();

		if (duracao <= 24) {
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else
			System.out.println("DURACAO MAXIMA EXCEDIDA");

	}

}

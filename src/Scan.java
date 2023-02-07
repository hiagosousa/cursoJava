import java.util.Locale;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String x;
		int y;
		double z;
		
		int a;
		String b;
		String c;
		char d;

		// Criar um scanner para verificar o que o usuário escreveu

		Scanner sc = new Scanner(System.in);

		// Guardar a próxima coisa escrita pelo usuário (.next = primeira palavra, .nextLine = linha inteira)
		x = sc.next();
		System.out.println(x);

		y = sc.nextInt();
		System.out.println(y);

		z = sc.nextDouble();
		System.out.println(z);

		// Fechar o scanner após o uso
		
		a = sc.nextInt();
		sc.nextLine(); // Para que o primeiro enter não consuma o próximo nextLine, criar um para consumir o primeiro!
		b = sc.nextLine();
		c = sc.nextLine();
		d = sc.nextLine().charAt(0); //Pegar apenas o primeiro caracter do que foi escrito.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();

	}

}

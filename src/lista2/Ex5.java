package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			System.out.printf("Total: R$ %.2f",(4.00 * quantidade));
		} else if(codigo == 2) {
			System.out.printf("Total: R$ %.2f",(4.50 * quantidade));
		} else if(codigo == 3) {
			System.out.printf("Total: R$ %.2f",(5.00 * quantidade));
		} else if(codigo == 4) {
			System.out.printf("Total: R$ %.2f",(2.00 * quantidade));
		} else if(codigo == 5) {
			System.out.printf("Total: R$ %.2f",(1.50 * quantidade));
		} else System.out.println("CODIGO INVALIDO");
		sc.close();
	}

}

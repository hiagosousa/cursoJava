import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Olá Mundo!");
		System.out.println("Salve");
		double x = 10.35784;
		
		System.out.printf("%.2f\n", x);
		
		//Muda o tipo de sintaxe a ser usado (Mudar para US para usar ponto ao invés de vírgula)
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f\n", x);
	}

}

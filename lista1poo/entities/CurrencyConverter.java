package entities;

public class CurrencyConverter {
	
	public static double dollar = 3.10;
	
	public static double conversao(double value) {
		return (dollar * value) + ((dollar * value)*6/100);
	}
	
}

package math;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite os valores do triangulo X");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite os valores do triangulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/ 2.0;
		double areaOfX = Math.sqrt(p*(p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC)/ 2.0;
		double areaOfY = Math.sqrt(p*(p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Area do triangulo X: %.4f\n",areaOfX);
		System.out.printf("Area do triangulo Y: %.4f\n",areaOfY);
		
		if(areaOfX > areaOfY) {
			System.out.println("X eh a maior area");
		} else {
			System.out.println("Y eh a maior area");
		}
		sc.close();
		
		
		
	}

}

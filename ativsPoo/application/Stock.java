package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Stock {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastre o produto");

		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preco: ");
		double price = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);

		System.out.println(product);
		System.out.println("Digite a quantidade de produtos a serem adicionados");
		quantity = sc.nextInt();
		product.addProduto(quantity);
		System.out.println(product);
		
		System.out.println("Digite a quantidade de produtos a serem removidos");
		quantity = sc.nextInt();
		product.removeProduto(quantity);
		System.out.println(product);

		sc.close();

	}

}

package application;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vector = new String[] { "Marcos", "José", "João", "Pedro", "Carlos" };

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		System.out.println("\n");

		//Leitura: Para cada objeto object contido em vector, realizar...
		for (String object : vector) {
			System.out.println(object);
		}

	}

}

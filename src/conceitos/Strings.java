package conceitos;

public class Strings {

	public static void main(String[] args) {

		String original = "  abcde FGHIJ klmno PQRS ABCD abcd   ";

		String s01 = original.toLowerCase(); // Para minúsculo
		String s02 = original.toUpperCase(); // Para maiúsculo
		String s03 = original.trim(); // Recortar espaçamentos desnecessários
		String s04 = original.substring(4); // Iniciar a string na posição x
		String s05 = original.substring(4, 13); // Iniciar e finalizar a string nas posições x,y
		String s06 = original.replace('a', 'x'); // substituir uma parte da string por outra
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); // Anotar a posição da primeira menção dos termos pedidos
		int j = original.lastIndexOf("bc"); // Anotar a posição da última menção dos termos pedidos
		String s = "Ola bom dia";
		String[]vect = s.split(" "); // Dividir a string em casas de um vetor toda vez que ver o valor definido
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(4,13): -" + s05 + "-");
		System.out.println("replace('a','x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07);
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}

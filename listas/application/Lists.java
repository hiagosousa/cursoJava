package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Joao");
		list.add("Joana");
		list.add("Alex");
		list.add("Luana");
		list.add(2, "Lucas");
		
		//Pode-se colocar uma posição OU conteúdo a ser removido.
		list.remove("Joana");

		System.out.println(list.size());
		for (String object : list) {
			System.out.println(object);
		}
		list.removeIf(condition -> condition.charAt(0) == 'J');
		for(String object : list) {
			System.out.println(object);
		}
		System.out.println("----------------------");
		//Se existir, indexOf retorna 1, se não existir, -1.
		System.out.println("Index of Alex: " + list.indexOf("Alex"));
		System.out.println("Index of Jose: " + list.indexOf("Jose"));
		System.out.println("----------------------");
		// Converto list para Stream -> Faço a operação Lambda -> fazê-lo voltar a ser uma Lista
		List<String> definitive = list.stream().filter(condition -> condition.charAt(0) == 'L').collect(Collectors.toList());
		
		for(String object : definitive) {
			System.out.println(object);
		}
		System.out.println("-----------------------");
		//Encontrar o primeiro nome iniciado com L. Se não encontrar, retornar null.
		String name = list.stream().filter(condition -> condition.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}

}

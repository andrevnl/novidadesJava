package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	//Java 9
	public static void main(String[] args) {
		List.of("primeiroNome", "segundoNome").forEach(System.out::println);
		Set.of("terceiroNome").forEach(System.out::println);
		Map.of("nome", "João").forEach((chave, valor) -> System.out.println(chave + " - " + valor));
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		 */
	}
}

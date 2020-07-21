package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	//Java 10
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");
		System.out.println(cpfPorNomes);
		/*
		HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");
		System.out.println(cpfPorNomes);
		 */
	}
}

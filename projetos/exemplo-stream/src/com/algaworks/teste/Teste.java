package com.algaworks.teste;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;

public class Teste {

	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();
		
		/*for (Fatura f : faturas) {
			if (f.getValor() > 250.0) {
				System.out.println("Alerta: Fatura acima de R$250.0 -> " + f);
			}
		}*/

		Stream<Fatura> st = faturas.stream()
				.filter(f -> f.getValor() > 250);
		st.forEach(f -> System.out.println(f));
		
		System.out.println();

		faturas.stream()
				.filter(f -> f.getValor() > 250)
				.forEach(f -> System.out.println(f));
		
		System.out.println();
		
		faturas.stream()
				.filter(Fatura::estaEmRisco)
				.forEach(System.out::println);
		
		System.out.println();
		
		List<Fatura> lista = faturas.stream()
				.filter(Fatura::estaEmRisco)
				.collect(Collectors.toList());
		
		lista.forEach(System.out::println);
		
	}
	
}

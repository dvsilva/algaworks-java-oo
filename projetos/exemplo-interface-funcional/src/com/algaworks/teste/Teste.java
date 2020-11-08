package com.algaworks.teste;

import com.algaworks.compra.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.impressoras.ImpressoraHP;

public class Teste {

	public static void main(String[] args) {
		Compra compra = new Compra("Sabonete", 2.5);
		// Impressora i = new ImpressoraHP();
		
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: " + c);
		};
		
		i.imprimir(compra);

		i = (Compra c) -> {
			System.out.println("Simulando a impressão. Seria impresso: " + c.getProduto());
		};
		
		i.imprimir(compra);
	}
	
}

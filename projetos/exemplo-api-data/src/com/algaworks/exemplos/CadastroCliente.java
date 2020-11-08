package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.algaworks.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jo�o Silva", LocalDate.of(1988, Month.AUGUST, 13));

		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

		if (idade >= 18) {
			System.out.printf("OK, pode ser cadastrado. Sua idade �: %d", idade);
		} else {
			System.err.printf("Sua idade �: %d. Ent�o n�o pode ter carteira.", idade);
		}
	}
}

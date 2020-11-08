package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.algaworks.model.Aluguel;
import com.algaworks.model.Carro;
import com.algaworks.model.Cliente;

public class NovoAluguel {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));

		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		aluguel.imprimirRecibo();
	}

}

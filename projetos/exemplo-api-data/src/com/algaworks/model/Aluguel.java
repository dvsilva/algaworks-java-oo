package com.algaworks.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	private LocalDateTime dataEHoraDaRetirada;
	private LocalDateTime dataEHoraPrevistaParaDevolucao;
	private LocalDateTime dataEHoraRealDaDevolucao;

	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada,
			LocalDateTime dataEHoraPrevistaParaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
		this.dataEHoraPrevistaParaDevolucao = dataEHoraPrevistaParaDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataEHoraDaRetirada() {
		return dataEHoraDaRetirada;
	}

	public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
	}

	public LocalDateTime getDataEHoraPrevistaParaDevolucao() {
		return dataEHoraPrevistaParaDevolucao;
	}

	public void setDataEHoraPrevistaParaDevolucao(LocalDateTime dataEHoraPrevistaParaDevolucao) {
		this.dataEHoraPrevistaParaDevolucao = dataEHoraPrevistaParaDevolucao;
	}

	public LocalDateTime getDataEHoraRealDaDevolucao() {
		return dataEHoraRealDaDevolucao;
	}

	public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
		this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
	}
	
	public void imprimirRecibo() {
		System.out.println(">>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<");
		System.out.println("Carro: " + carro.getModelo());
		System.out.println("Cliente: " + cliente.getNome());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data e hora da retirada: " + dataEHoraDaRetirada.format(formatter));
		System.out.println("Data e hora prevista para devolução: " + dataEHoraPrevistaParaDevolucao.format(formatter));
	}
	
	public void imprimeFatura() {
		Duration duration = Duration.between(dataEHoraPrevistaParaDevolucao, dataEHoraRealDaDevolucao);
		System.out.println(">>>>>>>>>>>> FATURA <<<<<<<<<<<<<<<");
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data e hora prevista para devolução: " + dataEHoraPrevistaParaDevolucao.format(formatter));
		System.out.println("Data e hora real da devolução: " + dataEHoraRealDaDevolucao.format(formatter));

		if (!duration.isNegative()) {
			double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
			System.out.printf("Valor da multa: R$ %.2f. Pois você atrasou %d horas.", multa, duration.toHours());
		} 
		else {
			System.out.println("Obrigado. Você foi pontual.");
		}
	}

}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	//ATRIBUTOS
	private LocalDate data;
	
	//CONSTRUTOR
	public Mentoria() {
		
	}
		
	//GETTERS & SETTERS
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	//MÉTODOS
	@Override
	public double calcularXp() {
		return XP_PADRAO +20d;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

	
	
	
}

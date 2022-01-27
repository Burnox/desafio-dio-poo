package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
	//ATRIBUTOS
	private String noe;
	private String descricao;
	private LocalDate dataInicial = LocalDate.now();
	private LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	//GETTERS & SETTERS
	public String getNoe() {
		return noe;
	}
	public void setNoe(String noe) {
		this.noe = noe;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	
	//EQUALS & HASH
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devsInscritos, noe);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(noe, other.noe);
	}
	
	
	
}

package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	//ATRIBUTOS
	private int cargaHoraria;
	
	//CONSTRUTOR
	public Curso() {
		
	}
	
	//GETTERS & SETTERS
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargahoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//MÉTODOS
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", carga horaria=" + cargaHoraria + "]";
	}

	
	
	
}

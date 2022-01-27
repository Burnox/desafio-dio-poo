package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo(" Fundamentos Java");
		curso1.setDescricao("Curso Java DIO");
		curso1.setCargahoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java Collections");
		curso2.setDescricao("Aprendendo sobre as collections no Java");
		curso2.setCargahoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("POO Java");
		mentoria1.setDescricao("Mentoria DIO NTT Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNoe("NTT Java Developer");
		bootcamp.setDescricao("Bootcamp para formação de devs Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devBruno = new Dev();
		devBruno.setNome("Bruno");
		devBruno.inscreverBootcamp(bootcamp);
		System.out.println(devBruno.getNome());
		System.out.println("Conteudos Inscritos" + devBruno.getConteudosInscritos());
		devBruno.progredir();
		System.out.println("Conteudo Finalizado!");
		System.out.println("Conteudos Concluidos" + devBruno.getConteudosConcluidos());
		System.out.println("Conteudos Restantes" + devBruno.getConteudosInscritos());
		System.out.println("XP Total Bruno = " + devBruno.calcularTotalXp()); 
		
		System.out.println();
		
		Dev devMark = new Dev();
		devMark.setNome("Marcus");
		devMark.inscreverBootcamp(bootcamp);
		System.out.println(devMark.getNome());
		System.out.println("Conteudos Inscritos" + devMark.getConteudosInscritos());
		devMark.progredir();
		System.out.println("Conteudo Finalizado!");
		System.out.println("Conteudos Concluidos" + devMark.getConteudosConcluidos());
		devMark.progredir();
		System.out.println("Conteudo Finalizado!");
		System.out.println("Conteudos Concluidos" + devMark.getConteudosConcluidos());
		System.out.println("Conteudos Restantes" + devMark.getConteudosInscritos());
		System.out.println("XP Total Marcus = " + devMark.calcularTotalXp());
		
		
	
	}

}

package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Programa {

	public static void main(String[] args) {
		
		Curso cursoUm = new Curso();
		cursoUm.setTitulo("Introdução ao Bootcamp");
		cursoUm.setDescricao("Falar sobre o bootcamp, tendo uma aproximidade com os Dev's");
		cursoUm.setCargaHoraria(8);
		
		Curso cursoDois = new Curso();
		cursoDois.setTitulo("Conhecendo as ferramentas");
		cursoDois.setDescricao("Mostrar as ferramentas utilizadas");
		cursoDois.setCargaHoraria(10);
		
		Curso cursoTreis = new Curso();
		cursoTreis.setTitulo("Linguagem Java");
		cursoTreis.setDescricao("Conhecendo a linguagem java");
		cursoTreis.setCargaHoraria(15);
		
		Curso cursoQuatro = new Curso();
		cursoQuatro.setTitulo("Curso de Orientação a Objeto");
		cursoQuatro.setDescricao("Curso completo de Orientação a Objeto");
		cursoQuatro.setCargaHoraria(20);
		
		Mentoria mentoriaUm = new Mentoria();
		mentoriaUm.setTitulo("Resolvendo desafios");
		mentoriaUm.setDescricao("Ajudando Dev's a solucionar os desafios");
		mentoriaUm.setDataMentoria(LocalDate.now());
		
		Mentoria mentoriaDois = new Mentoria();
		mentoriaDois.setTitulo("Bootcamp Finalizado");
		mentoriaDois.setDescricao("Agradencendo ao Dev's");
		mentoriaDois.setDataMentoria(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(cursoUm);
		bootcamp.getConteudos().add(cursoDois);
		bootcamp.getConteudos().add(cursoTreis);
		bootcamp.getConteudos().add(mentoriaUm);
		bootcamp.getConteudos().add(cursoQuatro);
		bootcamp.getConteudos().add(mentoriaDois);
		
		Dev devAlb = new Dev();
		devAlb.setNome("Alb");
		devAlb.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + devAlb.getNome() + ": " + devAlb.getConteudosInscritos());
		devAlb.progredir();
		devAlb.progredir();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Conteúdos Inscritos " + devAlb.getNome() + ": " + devAlb.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos " + devAlb.getNome() + ": " + devAlb.getConteudosConcluidos());
		System.out.println("XP: " + devAlb.calcularTotalXP());
		System.out.println("----------------------------------------------------------------------------------");
		Dev devBlee = new Dev();
		devBlee.setNome("Blee");
		devBlee.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + devBlee.getNome() + ": " + devBlee.getConteudosInscritos());
		devBlee.progredir();
		devBlee.progredir();
		devBlee.progredir();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Conteúdos Inscritos " + devBlee.getNome() + ": " + devBlee.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos " + devBlee.getNome() + ": " + devBlee.getConteudosConcluidos());
		System.out.println("XP: " + devBlee.calcularTotalXP());

	}

}

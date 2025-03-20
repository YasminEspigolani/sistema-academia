package br.com.starvip.academia;

public class Aulas {
	
	public String tema;
	public double horario;
	public String professor;
	
	public Aulas(String tema, double horario, String professor) {
		super();
		this.tema = tema;
		this.horario = horario;
		this.professor = professor;
	}


	public void lecionar() {
		
		System.out.println("O professor responsável por essa aula é: "+professor);
	}
	public void começar() {
		
		System.out.println("A aula irá começar às: "+horario);
	}
}

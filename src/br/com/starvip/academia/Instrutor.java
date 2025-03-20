package br.com.starvip.academia;

public class Instrutor {

	public String nome;
	public int idade;
	public String formacao;
	
	public Instrutor(String nome, int idade, String formacao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.formacao = formacao;
	}


	public void acompanhar() {
		
		System.out.println("Acompanhando o aluno durante o exercício.");
	}
	
	public void baterPonto(boolean registro) {
		
		if (registro==true) {
			
			System.out.println("O instrutor já bateu o ponto.");
		}else {
			System.out.println("Instrutor com registro pendente!");
		}
	}
}

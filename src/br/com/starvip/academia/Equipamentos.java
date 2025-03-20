package br.com.starvip.academia;

public class Equipamentos {

	public String nome;
	public String modelo;
	public int anoFabricacao;
	
	public Equipamentos(String nome, String modelo, int anoFabricacao) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public void utilizar(boolean ocupado) {
		
	if (ocupado==true) {
	
		
		System.out.println("O aparelho está sendo utilizado por outro aluno! ");
	
	}else {
		
		System.out.println("Aparelho livre, vamos nos exercitar!");
	}
	}
	
	public void manutencao() {
		
		System.out.println("ATENÇÃO! Aparelho em manutenção, volte mais tarde.");
	}
}
package br.com.starvip.main;
import br.com.starvip.academia.Aulas;
import br.com.starvip.academia.Equipamentos;
import br.com.starvip.academia.Instrutor;

public class Main {

	public static void main(String[] args) {
		
		Instrutor objInstrutor = new Instrutor("Joadson", 25, "Fisioterapia");
		Equipamentos objEquipamentos = new Equipamentos("Cadeira Extensora", "R2D2", 1985);
		Aulas objAulas = new Aulas("Jumping", 15.30, "Alex");
		
		objInstrutor.acompanhar();
		objInstrutor.baterPonto(true);
		objInstrutor.baterPonto(false);
		
		objEquipamentos.manutencao();
		objEquipamentos.utilizar(true);
		objEquipamentos.utilizar(false);
		
		objAulas.começar();
		objAulas.lecionar();
	}
}

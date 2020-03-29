package br.lasalle.oop.semana3;

public class ContaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta itau = new Conta("Alex");
		
		//itau.setNomeTitular("Alex");
		itau.depositar(100f);
		itau.listar();
		
		itau.sacar(10f);
		itau.listar();
		
		itau.sacar(1000f);
		itau.listar();
		
	}

}

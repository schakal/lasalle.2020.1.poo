package br.lasalle.oop.semana3.ex2;

public class Professor {
	
	public Professor()
	{
		System.out.println("Nova classe instanciada");
		setDisponivel(true);
	}
	
	//atributos da classe
	private String matr;
	private String nome;
	private String especialidade;
	private boolean disponivel;
	
	//metodos get/set
	public String getMatr() {
		return matr;
	}
	public void setMatr(String matr) {
		this.matr = matr;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	//listar
	public void listar()
	{
		System.out.println("Matr:" + this.matr + " ;" +
				"Nome:" + this.nome + " ;" +
				"Especialidade:" + this.especialidade + " ;" +
				"Disponivel:" + this.disponivel + " ."
				);
	}

}

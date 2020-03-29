package br.lasalle.oop.semana3.ex2;

public class Aluno {
	private String matricula;
	private String nome;
	private int periodo;
	
	//getters/setters
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public void listar()
	{
		System.out.println(this.toString());
	}
	
	//listar
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", periodo=" + periodo + "]";
	}
	
	
	
}

package br.lasalle.oop.semana3.ex2;

import java.util.ArrayList;

public class Turma {
	private String codigo;
	private String descricao;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	
	public Turma()
	{
		alunos = new ArrayList<Aluno>();
	}
	
	//getters/setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	/*
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	*/
	
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void listar()
	{
		System.out.println("Listagem da turma");
		System.out.println("====================");
		System.out.println("Codigo: " + getCodigo() + "\n" +
				"Descrição: " + getDescricao() + "\n" +
				"Nome Professor: " + getProfessor().getNome() + "\n" +
				"Especialidade Professor: " + getProfessor().getEspecialidade() 
				);
		
		System.out.println("Relação de alunos da turma");
		System.out.println("==========================");
		//listar alunos
		for(int i=0; i<this.alunos.size();i++)
		{
			Aluno aluno = alunos.get(i);
			System.out.println((i+1)+ "-Nome:" + aluno.getNome());
		}
		
	}
	
	public void adicionarAluno(Aluno novoAluno)
	{
		alunos.add(novoAluno);
	}
	
	
}

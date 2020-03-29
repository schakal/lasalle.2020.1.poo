package br.lasalle.oop.semana3.ex2;

public class ProfessorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		professor.setMatr("001");
		professor.setNome("Alex");
		professor.setEspecialidade("Sistema de Informação");
		
		//professor.listar();
		
		Aluno a1 = new Aluno();
		a1.setMatricula("001");
		a1.setNome("Joao");
		a1.setPeriodo(1);
		//a1.listar();
		
		Aluno a2 = new Aluno();
		a2.setMatricula("002");
		a2.setNome("Maria");
		a2.setPeriodo(1);
		//a1.listar();
		
		Aluno a3 = new Aluno();
		a3.setMatricula("003");
		a3.setNome("Arrascaeta");
		a3.setPeriodo(1);
		//a1.listar();
		
		
		
		Turma poo = new Turma();
		poo.setCodigo("ABACD");
		poo.setDescricao("Prog Orientado a Objetos");
		poo.setProfessor(professor);
		//poo.listar();
		poo.adicionarAluno(a1);
		poo.adicionarAluno(a2);
		poo.adicionarAluno(a3);
		
		poo.listar();
		
	}

}

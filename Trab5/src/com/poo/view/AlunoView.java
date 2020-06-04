package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

public class AlunoView {
	
	
	public void create()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			System.out.println("Entre com a matricula:");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o nome:");
			aluno.setNome(sc.nextLine());
			
			controller.create(aluno);
		}
		catch(Exception e)
		{
			System.out.println("Erro na tela de incluir aluno");
		}
		
	}
	
	
	public void readAll()
	{
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de alunos");
		System.out.println("*******************");
		for(Aluno aluno:controller.readAll())
		{
			System.out.println("Matricula:" + aluno.getMatricula());
			System.out.println("Nome:" + aluno.getNome());
			System.out.println("-------------------------");
		}
		
	}
	
	public void altera() {
		try {
			Scanner scan = new Scanner(System.in);

			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();

			
			System.out.println("Entre com a matricula do aluno que deseja alterar os dados");
			aluno.setMatricula(scan.nextLine());
			System.out.println("Entre com o nome a ser alterado:");
			
			aluno.setNome(scan.nextLine());

			controller.altera(aluno);
			
			

		} catch (Exception e) {
			System.out.println("Erro na tela de excluir aluno");
		}
	}

	
	public void remove() {
		try {
			Scanner scan = new Scanner(System.in);

			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			System.out.println("Entre com a matricula do aluno que deseja excluir");
			aluno.setMatricula(scan.nextLine());
			controller.remove(aluno);

		} catch (Exception e) {
			System.out.println("Erro na tela de exclução aluno");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoView crud = new AlunoView();
		
		//crud.create();
		//crud.readAll();
		crud.altera();
		crud.remove();
		
	
	 }

}

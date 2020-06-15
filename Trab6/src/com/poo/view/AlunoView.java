package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

public class AlunoView {

	// pede dados do aluno para gravar no banco
	public void create() {
		try {
			Scanner scan = new Scanner(System.in);

			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			System.out.println("******INCLUSÃO******");
			System.out.println("Entre com a matricula:");
			aluno.setMatricula(scan.nextLine());
			System.out.println("Entre com o nome:");
			aluno.setNome(scan.nextLine());

			controller.create(aluno);

		} catch (Exception e) {
			System.out.println("Erro na tela de incluir aluno");
		}
	}

	public void readAll() {
		AlunoController controller = new AlunoController();

		System.out.println("Listagem de alunos");
		System.out.println("*******************");
		for (Aluno aluno : controller.readAll()) {
			System.out.println("Matricula:" + aluno.getMatricula());
			System.out.println("Nome:" + aluno.getNome());
			System.out.println("-------------------------");
		}

	}

	public void update() {
		try {
			Scanner scan = new Scanner(System.in);

			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();

			System.out.println("******ATUALIZAÇÃO******");
			System.out.println("Entre com a matricula:");
			aluno.setMatricula(scan.nextLine());
			System.out.println("Entre com o nome a ser alterado:");
			aluno.setNome(scan.nextLine());
			System.out.println("Novo nome:");
			aluno.setNome(scan.nextLine());

			controller.update(aluno);
			
			

		} catch (Exception e) {
			System.out.println("Erro na tela de excluir aluno");
		}
	}

	// pede dados do aluno para apagar no banco
	public void delete() {
		try {
			Scanner scan = new Scanner(System.in);

			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			System.out.println("******EXCLUÇÃO******");
			System.out.println("Entre com a matricula:");
			aluno.setMatricula(scan.nextLine());
			controller.delete(aluno);

		} catch (Exception e) {
			System.out.println("Erro na tela de exclução aluno");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlunoView crud = new AlunoView();
		crud.create();
		crud.readAll();
		crud.update();
		crud.delete();

	}

}

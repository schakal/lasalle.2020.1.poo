package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.FornecedorDAO;
import com.poo.model.Fornecedor;

public class FornecedorController {
	


	// regra para incluir um aluno

	public void create(Fornecedor fornecedor) {
		try {
			FornecedorDAO dao = new FornecedorDAO();

			dao.create(fornecedor);
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("Erro no Controller");
		} finally {
			// System.out.println("Fim insersão");
		}
	}
	// regra para ler um aluno

	public List<Fornecedor> readAll() {
		List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
		try {
			FornecedorDAO dao = new FornecedorDAO();
			fornecedor = dao.readAll();
		} finally {
		}

		return fornecedor;
	}
	// regra para alterar um aluno

	public void update(Fornecedor fornecedor) {
		try {
			FornecedorDAO dao = new FornecedorDAO();

			dao.update(fornecedor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		} finally {
			System.out.println("Fim alteração");
		}
	}

	public void delete(Fornecedor fornecedor) {
		try {
			FornecedorDAO dao = new FornecedorDAO();

			dao.delete(fornecedor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		} finally {
			System.out.println("Fim Exclução");
		}
	}

}

package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.FuncionarioDAO;
import com.poo.model.Funcionario;

public class FuncionarioController {
	


		// regra para incluir um aluno

		public void create(Funcionario funcionario) {
			try {
				FuncionarioDAO dao = new FuncionarioDAO();

				dao.create(funcionario);
			} catch (Exception e) {
				// TODO: handle exception
				// System.out.println("Erro no Controller");
			} finally {
				// System.out.println("Fim insersão");
			}
		}
		// regra para ler um aluno

		public List<Funcionario> readAll() {
			List<Funcionario> funcionario = new ArrayList<Funcionario>();
			try {
				FuncionarioDAO dao = new FuncionarioDAO();
				funcionario = dao.readAll();
			} finally {
			}

			return funcionario;
		}
		// regra para alterar um aluno

		public void update(Funcionario funcionario) {
			try {
				FuncionarioDAO dao = new FuncionarioDAO();

				dao.update(funcionario);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro no Controller");
			} finally {
				System.out.println("Fim alteração");
			}
		}

		public void delete(Funcionario funcionario) {
			try {
				FuncionarioDAO dao = new FuncionarioDAO();

				dao.delete(funcionario);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro no Controller");
			} finally {
				System.out.println("Fim Exclução");
			}
		}

	}


	
	



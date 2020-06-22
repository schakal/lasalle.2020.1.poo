package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Funcionario;

public class FuncionarioDAO {

		// Insere funcionario no banco CRUD - Create, Read, Update, Delete
		public void create(Funcionario funcionario) {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;

			String sql = "insert into funcionario(codigo,cargo,nome,cpf,endereco,cidade,estado,telefone,email) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			try {

				stmt = con.prepareStatement(sql); // instancia uma instrucao sql
				stmt.setString(1, funcionario.getCodigo()); 
				stmt.setString(2, funcionario.getCargo()); 
				stmt.setString(3, funcionario.getNome()); 
				stmt.setString(4, funcionario.getCpf());
				stmt.setString(5, funcionario.getEndereco()); 
				stmt.setString(6, funcionario.getCidade());
				stmt.setString(7, funcionario.getEstado()); 
				stmt.setString(8, funcionario.getTelefone());
				stmt.setString(9, funcionario.getEmail());

				stmt.execute();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				ConnectionFactory.closeConnection(con, stmt);
			}

		}

		// Ler todos os registros da tabela funcionario
		public List<Funcionario> readAll() {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;

			String sql = " select * from funcionario";
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();

			try {
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();

				while (rs.next()) {
					Funcionario func = new Funcionario();
					func.setCodigo(rs.getString("Codigo"));
					func.setCargo(rs.getString("Cargo"));
					func.setNome(rs.getString("Nome"));
					func.setCpf(rs.getString("Cpf"));
					func.setEndereco(rs.getString("Endereco"));
					func.setCidade(rs.getString("Cidade"));
					func.setEstado(rs.getString("Estado"));
					func.setTelefone(rs.getString("Telefone"));
					func.setEmail(rs.getString("Email"));


					funcionarios.add(func);
				}
				
				
			} 
			catch (SQLException e) { e.printStackTrace();
				System.out.println("Erro ao tentar ler tabela funcionario");
			} finally {
				ConnectionFactory.closeConnection(con, stmt);
			}

			return funcionarios;
		}

		public void update(Funcionario funcionario) throws SQLException {

			try {
				
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;

				
				String sql = "UPDATE funcionario SET cargo=?,nome=?,cpf=?,endereco=?,cidade=?,estado=?,telefone=?,email=? WHERE codigo=?";
				PreparedStatement preparedStmt = con.prepareStatement(sql);
				
				preparedStmt.setString(1, funcionario.getCargo());
				preparedStmt.setString(2, funcionario.getNome());
				preparedStmt.setString(3, funcionario.getCpf());
				preparedStmt.setString(4, funcionario.getEndereco());
				preparedStmt.setString(5, funcionario.getCidade());
				preparedStmt.setString(6, funcionario.getEstado());
				preparedStmt.setString(7, funcionario.getTelefone());
				preparedStmt.setString(8, funcionario.getEmail());
				preparedStmt.setString(9, funcionario.getCodigo());
				preparedStmt.execute();

				con.close();
			} catch (Exception e) {
			}
		}

		public void delete(Funcionario funcionario) {
			try {
				
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;

				
				String query = "delete from funcionario where codigo = ?";
				PreparedStatement preparedStmt = con.prepareStatement(query);
				
				preparedStmt.setInt(1, Integer.parseInt(funcionario.getCodigo()));

				
				preparedStmt.execute();

				con.close();
			} catch (Exception e) {e.printStackTrace();
			}
		}


}

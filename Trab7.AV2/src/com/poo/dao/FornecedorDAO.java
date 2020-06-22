package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Fornecedor;


public class FornecedorDAO {
	
	// Insere funcionario no banco CRUD - Create, Read, Update, Delete
			public void create(Fornecedor fornecedor) {
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;

				String sql = "insert into fornecedor(codigo,nome,cnpj,endereco,cidade,estado,telefone,email) values (?, ?, ?, ?, ?, ?, ?, ?)";

				try {

					stmt = con.prepareStatement(sql); // instancia uma instrucao sql
					stmt.setString(1, fornecedor.getCodigo());  
					stmt.setString(2, fornecedor.getNome()); 
					stmt.setString(3, fornecedor.getCnpj());
					stmt.setString(4, fornecedor.getEndereco()); 
					stmt.setString(5, fornecedor.getCidade());
					stmt.setString(6, fornecedor.getEstado()); 
					stmt.setString(7, fornecedor.getTelefone());
					stmt.setString(8, fornecedor.getEmail());

					stmt.execute();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					ConnectionFactory.closeConnection(con, stmt);
				}

			}

			// Ler todos os registros da tabela funcionario
			public List<Fornecedor> readAll() {
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;
				ResultSet rs = null;

				String sql = " select * from fornecedor";
				List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();

				try {
					stmt = con.prepareStatement(sql);
					rs = stmt.executeQuery();

					while (rs.next()) {
						Fornecedor forne = new Fornecedor();
						forne.setCodigo(rs.getString("Codigo"));
						forne.setNome(rs.getString("Nome"));
						forne.setCnpj(rs.getString("CNPJ"));
						forne.setEndereco(rs.getString("Endereco"));
						forne.setCidade(rs.getString("Cidade"));
						forne.setEstado(rs.getString("Estado"));
						forne.setTelefone(rs.getString("Telefone"));
						forne.setEmail(rs.getString("Email"));


						fornecedor.add(forne);
					}
					
					
				} 
				catch (SQLException e) {e.printStackTrace();
					System.out.println("Erro ao tentar ler tabela fornecedor");
				} finally {
					ConnectionFactory.closeConnection(con, stmt);
				}

				return fornecedor;
			}

			public void update(Fornecedor fornecedor) throws SQLException {

				try {
					
					Connection con = ConnectionFactory.getConnection();
					PreparedStatement stmt = null;

					
					String query = "UPDATE fornecedor SET nome=?,cnpj=?,endereco=?,cidade=?,estado=?,telefone=?,email=? WHERE codigo=?";
					PreparedStatement preparedStmt = con.prepareStatement(query);
					
					preparedStmt.setString(1, fornecedor.getNome());
					preparedStmt.setString(2, fornecedor.getCnpj());
					preparedStmt.setString(3, fornecedor.getEndereco());
					preparedStmt.setString(4, fornecedor.getCidade());
					preparedStmt.setString(5, fornecedor.getEstado());
					preparedStmt.setString(6, fornecedor.getTelefone());
					preparedStmt.setString(7, fornecedor.getEmail());
					preparedStmt.setString(8, fornecedor.getCodigo());
					preparedStmt.execute();

					con.close();
				} catch (Exception e) {
				}
			}

			public void delete(Fornecedor fornecedor) {
				try {
					
					Connection con = ConnectionFactory.getConnection();
					PreparedStatement stmt = null;

					
					String query = "delete from fornecedor where codigo = ?";
					PreparedStatement preparedStmt = con.prepareStatement(query);
					
					preparedStmt.setInt(1, Integer.parseInt(fornecedor.getCodigo()));
					


					
					preparedStmt.execute();

					con.close();
				} catch (Exception e) {
				}
			}


}

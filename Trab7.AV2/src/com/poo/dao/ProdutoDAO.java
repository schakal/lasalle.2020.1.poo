package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Produto;

public class ProdutoDAO {

	
	// Insere funcionario no banco CRUD - Create, Read, Update, Delete
			public void create(Produto produto) {
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;

				String sql = "insert into produto(id,nome,qtd,descricao) values (?, ?, ?, ?)";

				try {

					stmt = con.prepareStatement(sql); // instancia uma instrucao sql
					stmt.setString(1, produto.getId()); 
					stmt.setString(2, produto.getNome()); 
					stmt.setString(3, produto.getQtd());
					stmt.setString(4, produto.getDescricao()); 
					

					stmt.execute();

				} catch (SQLException e) {e.printStackTrace();
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					ConnectionFactory.closeConnection(con, stmt);
				}

			}

			// Ler todos os registros da tabela funcionario
			public List<Produto> readAll() {
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;
				ResultSet rs = null;

				String sql = " select * from produto";
				List<Produto> produto = new ArrayList<Produto>();

				try {
					stmt = con.prepareStatement(sql);
					rs = stmt.executeQuery();

					while (rs.next()) {
						Produto prod = new Produto();
						prod.setId(rs.getString("id"));
						
						prod.setNome(rs.getString("Nome"));
						prod.setQtd(rs.getString("Qtd"));
						prod.setDescricao(rs.getString("Descricao"));
						


						produto.add(prod);
					}
					
					
				} 
				catch (SQLException e) {e.printStackTrace();
					System.out.println("Erro ao tentar ler tabela de produtos");
				} finally {
					ConnectionFactory.closeConnection(con, stmt);
				}

				return produto;
			}

			public void update(Produto produto) throws SQLException {
				try {
					
					Connection con = ConnectionFactory.getConnection();
					PreparedStatement stmt = null;

					
					String sql = "UPDATE produto SET nome=?,qtd=?,descricao=? WHERE id=?";
					PreparedStatement preparedStmt = con.prepareStatement(sql);
					
					preparedStmt.setString(1, produto.getNome());
					preparedStmt.setString(4, produto.getId());
					
					preparedStmt.setString(2, produto.getQtd());
					preparedStmt.setString(3, produto.getDescricao());

					
					preparedStmt.execute();

					con.close();
				} catch (Exception e) {
				}
				
				
			}

			public void delete(Produto produto) {
				try {
					
					Connection con = ConnectionFactory.getConnection();
					PreparedStatement stmt = null;

					
					String query = "delete from produto where id = ?";
					PreparedStatement preparedStmt = con.prepareStatement(query);
					
					preparedStmt.setInt(1, Integer.parseInt(produto.getId()));
					
					

					
					preparedStmt.execute();

					con.close();
				} catch (Exception e) {
				}
			}

			

			
}

package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Aluno;

public class AlunoDAO {
	

	
	//insere aluno no banco CRUD - Create, Read, Update and Delete
	
	public void create(Aluno aluno)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aluno(matricula, nome) values (?, ?)";
		
		try {
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, aluno.getMatricula()); ///primeiro parametro da query
			stmt.setString(2, aluno.getNome());
			
			stmt.executeUpdate();
			System.out.println("[AlunoDAO] Aluno incluido com sucesso!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		
		
	}
	
	public List<Aluno> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select matricula, nome from aluno";
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Aluno aluno = new Aluno();
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				
				alunos.add(aluno);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela aluno");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return alunos;
	}
	
	public void altera(Aluno aluno) {
	    String sql = "update aluno set nome=?," + "where matricula=?";
	    Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
	    try {
	        stmt = con.prepareStatement(sql);
	        stmt.setString(1, aluno.getNome());
	        //stmt.setString(2, contato.getEmail());
	       // stmt.setString(3, contato.getEndereco());
	        //stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
	        stmt.setString(2, aluno.getMatricula());
	        stmt.executeUpdate();
	        System.out.println("Valores atualizados com sucesso.");
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	    
	    
	}
	
	public void remove(Aluno aluno) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "delete from aluno where id=?";
		
        try {
        	stmt = con.prepareStatement(sql);
        	
            stmt.setString(1, aluno.getMatricula());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

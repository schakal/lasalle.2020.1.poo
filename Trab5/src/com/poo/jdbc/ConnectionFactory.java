package com.poo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {


	private static final String DRIVE = "com.mysql.jdbc.Driver";
	///private static final String URL = "jdbc:mysql:localhost:3306"; 
	///private static final String URL = "jdbc:mysql:127.0.0.0:3306"; 
	private static final String URL = "jdbc:mysql://database-1.csj4ynaticdg.us-east-1.rds.amazonaws.com:3306/meu_banco_aula?useTimezone=true&serverTimezone=UTC"; 
	private static final String USER = "admin"; 
	private static final String SENHA = "Senha123"; 
	
	public static Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection(URL, USER, SENHA);
			
		}catch (SQLException e) {
			throw new RuntimeException("Erro na conexao com o Banco de Dados", e);
		}
	}
	
	public static void closeConnection(Connection con) {
		
		if(con!=null)
		{
			
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt)
	{
		closeConnection(con);
		
		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs)
	{
		closeConnection(con, stmt);
		
		if(rs != null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

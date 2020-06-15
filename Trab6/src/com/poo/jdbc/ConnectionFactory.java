package com.poo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String DRIVE = "com.mysql.jdbc.Driver";

	// private static final String URL =
	// "jdbc:mysql://bd-poo.comquktz5ulz.us-east-1.rds.amazonaws.com:3306/bd_poo?useTimezone=true&serverTimezone=UTC";
	// private static final String URL =
	// "jdbc:mysql://db-poo.cy5hrvkxpl9s.us-east-1.rds.amazonaws.com:3306/meu_banco_aula?useTimezone=true&serverTimezone=UTC";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/aluno?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String SENHA = "";

	public static Connection getConnection() {
		try {

			// Class.forName(DRIVER); opcional dependendo da versao

			return DriverManager.getConnection(URL, USER, SENHA);
		} catch (SQLException e) {
			throw new RuntimeException("Erro na conexão com o Banco de Dados!", e);
		}
	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt) {
		closeConnection(con);

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

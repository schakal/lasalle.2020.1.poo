package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.poo.dao.AlunoDAO;
import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Aluno;
import com.sun.jdi.connect.spi.Connection;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;


import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class Consultar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar frame = new Consultar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Consultar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Consultar.class.getResource("/image/zoom.png")));
		setTitle("Listar Aluno");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				carregarTabela();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	    }
		
		
			
		});
		btnListar.setBounds(173, 227, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnPrincipal = new JButton("");
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal().setVisible(true);
			     dispose();
			}
		});
		btnPrincipal.setIcon(new ImageIcon(Consultar.class.getResource("/image/arrow_left.png")));
		btnPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrincipal.setBounds(10, 11, 49, 23);
		contentPane.add(btnPrincipal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 171);
		contentPane.add(scrollPane);
		
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		modelo.addColumn("Matricula");
		modelo.addColumn("Nome");
		
	}
	public void carregarTabela() throws SQLException {
		
		com.poo.dao.AlunoDAO aluno = new com.poo.dao.AlunoDAO();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);
	    ArrayList<Aluno> alunos = (ArrayList<Aluno>) aluno.readAll();
	    for (Aluno a : alunos) {
	        model.addRow(new Object[]{a.getMatricula(), a.getNome()});
	    }
		
		
		
		
		
		
		
		
		
		
		
		/*
		String URL = "jdbc:mysql://127.0.0.1:3306/aluno?useTimezone=true&serverTimezone=UTC";
		String USER = "root";
		String SENHA = "";
		Connection con = (Connection) DriverManager.getConnection(URL, USER, SENHA);
		com.poo.dao.AlunoDAO aluno = new com.poo.dao.AlunoDAO();
		
		ArrayList<Aluno> list = new ArrayList<Aluno>();
		
		
		
		for (Aluno alunos : list) {
			modelo.addRow(new Object[] {alunos.getMatricula(),alunos.getNome()});
			
		}
		
		
		
		
		*/
	}
	
}

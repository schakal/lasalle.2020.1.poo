package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.poo.model.Funcionario;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel modelo = new DefaultTableModel();
	private JButton btnMenu;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFuncionario frame = new ConsultarFuncionario();
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
	public ConsultarFuncionario() {
		setTitle("Listar Funcionário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 372);
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
		btnListar.setBounds(213, 299, 89, 23);
		contentPane.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 522, 255);
		contentPane.add(scrollPane);
		
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		
		btnMenu = new JButton("Voltar");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(323, 299, 89, 23);
		contentPane.add(btnMenu);
		
		modelo.addColumn("Codigo");
		modelo.addColumn("Cargo");
		modelo.addColumn("Nome");
		modelo.addColumn("Cpf");
		modelo.addColumn("Endereço");
		modelo.addColumn("Cidade");
		modelo.addColumn("Estado");
		modelo.addColumn("Telefone");
		modelo.addColumn("Email");
		
	}
public void carregarTabela() throws SQLException {
		
		com.poo.dao.FuncionarioDAO funcionario = new com.poo.dao.FuncionarioDAO();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);
	    ArrayList<Funcionario> funcionarios = (ArrayList<Funcionario>) funcionario.readAll();
	    for (Funcionario f : funcionarios) {
	        model.addRow(new Object[]{
	        		f.getCodigo(),
	        		f.getCargo(),
	        		f.getNome(),
	        		f.getCpf(),
	        		f.getEndereco(),
	        		f.getCidade(),
	        		f.getEstado(),
	        		f.getTelefone(),
	        		f.getEmail(),
	        		});
	    }
	}
	

}

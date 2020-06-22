package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.poo.model.Fornecedor;
import com.poo.model.Funcionario;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ConsultarFornecedor extends JFrame {

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
					ConsultarFornecedor frame = new ConsultarFornecedor();
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
	public ConsultarFornecedor() {
		setTitle("Listar Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 411);
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
		
		
		JButton btnMenu = new JButton("Voltar");
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
		modelo.addColumn("Nome");
		modelo.addColumn("CNPJ");
		modelo.addColumn("Endereço");
		modelo.addColumn("Cidade");
		modelo.addColumn("Estado");
		modelo.addColumn("Telefone");
		modelo.addColumn("Email");
	}
public void carregarTabela() throws SQLException {
		
		com.poo.dao.FornecedorDAO fornecedor = new com.poo.dao.FornecedorDAO();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);
	    ArrayList<Fornecedor> fornecedors = (ArrayList<Fornecedor>) fornecedor.readAll();
	    for (Fornecedor fn : fornecedors) {
	        model.addRow(new Object[]{
	        		fn.getCodigo(),
	        		fn.getNome(),
	        		fn.getCnpj(),
	        		fn.getEndereco(),
	        		fn.getCidade(),
	        		fn.getEstado(),
	        		fn.getTelefone(),
	        		fn.getEmail(),
	        		});
	    }
	}
	
}

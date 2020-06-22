package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.poo.dao.FuncionarioDAO;
import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class AlterarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textCargo;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textCidade;
	private JTextField textEndereco;
	private JTextField textEstado;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JTextField textCodigoFunc;
	private JTextField textCodigoBus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarFuncionario frame = new AlterarFuncionario();
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
	public AlterarFuncionario() {
		setTitle("Alterar Funcionário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00D3DIGO");
		lblNewLabel.setBounds(10, 99, 46, 14);
		contentPane.add(lblNewLabel);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(10, 124, 103, 20);
		contentPane.add(textCodigo);
		
		JLabel lblNewLabel_2 = new JLabel("CARGO");
		lblNewLabel_2.setBounds(196, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textCargo = new JTextField();
		textCargo.setColumns(10);
		textCargo.setBounds(196, 124, 131, 20);
		contentPane.add(textCargo);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(10, 155, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(10, 180, 329, 20);
		contentPane.add(textNome);
		
		JLabel lblNewLabel_4 = new JLabel("CPF");
		lblNewLabel_4.setBounds(10, 211, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(10, 236, 131, 20);
		contentPane.add(textCpf);
		
		JLabel lblNewLabel_6 = new JLabel("CIDADE");
		lblNewLabel_6.setBounds(208, 211, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(208, 236, 131, 20);
		contentPane.add(textCidade);
		
		JLabel lblNewLabel_5 = new JLabel("ENDERE\u00C7O");
		lblNewLabel_5.setBounds(10, 267, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(10, 292, 234, 20);
		contentPane.add(textEndereco);
		
		JLabel lblNewLabel_7 = new JLabel("ESTADO");
		lblNewLabel_7.setBounds(271, 267, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textEstado = new JTextField();
		textEstado.setColumns(10);
		textEstado.setBounds(271, 292, 108, 20);
		contentPane.add(textEstado);
		
		JLabel lblNewLabel_8 = new JLabel("TELEFONE");
		lblNewLabel_8.setBounds(10, 323, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(10, 348, 131, 20);
		contentPane.add(textTelefone);
		
		JLabel lblNewLabel_3 = new JLabel("E-MAIL");
		lblNewLabel_3.setBounds(175, 323, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(175, 348, 234, 20);
		contentPane.add(textEmail);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				com.poo.model.Funcionario func = new com.poo.model.Funcionario();
				
				func.setCodigo(textCodigo.getText());
				func.setCargo(textCargo.getText());
				func.setNome(textNome.getText());
				func.setCpf(textCpf.getText());
				func.setEndereco(textEndereco.getText());
				func.setCidade(textCidade.getText());
				func.setEstado(textEstado.getText());
				func.setTelefone(textTelefone.getText());
				func.setEmail(textEmail.getText());


				com.poo.dao.FuncionarioDAO dao = new com.poo.dao.FuncionarioDAO();
				dao.update(func);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!!");
				
			}
		});
		btnAlterar.setBounds(98, 405, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCodigo.setText("");
				textCargo.setText("");
				textNome.setText("");
				textCpf.setText("");
				textEndereco.setText("");
				textCidade.setText("");
				textTelefone.setText("");
				textEmail.setText("");
			}
		});
		btnLimpar.setBounds(228, 405, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(351, 405, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_9 = new JLabel("C\u00D3DIGO");
		lblNewLabel_9.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			        
				
				
			}	
		});
		btnBuscar.setBounds(123, 31, 89, 23);
		contentPane.add(btnBuscar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 73, 559, 2);
		contentPane.add(separator);
		
		textCodigoBus = new JTextField();
		textCodigoBus.setBounds(10, 32, 86, 20);
		contentPane.add(textCodigoBus);
		textCodigoBus.setColumns(10);
	}
}
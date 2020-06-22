package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import com.poo.controller.FuncionarioController;
import com.poo.dao.FuncionarioDAO;
import com.poo.model.Funcionario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IncluirFuncionario extends JFrame {
	
	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textCargo;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEndereco;
	private JTextField textCidade;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JTextField textEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirFuncionario frame = new IncluirFuncionario();
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
	public IncluirFuncionario()  {
		setTitle("Cadastro Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(10, 36, 103, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textCargo = new JTextField();
		textCargo.setBounds(208, 36, 131, 20);
		contentPane.add(textCargo);
		textCargo.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(10, 91, 329, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(10, 161, 131, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(10, 228, 234, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(208, 161, 131, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(10, 307, 131, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(175, 307, 234, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00D3DIGO");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CARGO");
		lblNewLabel_2.setBounds(208, 11, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-MAIL");
		lblNewLabel_3.setBounds(175, 282, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF");
		lblNewLabel_4.setBounds(10, 136, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ENDERE\u00C7O");
		lblNewLabel_5.setBounds(10, 203, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CIDADE");
		lblNewLabel_6.setBounds(208, 136, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("ESTADO");
		lblNewLabel_7.setBounds(271, 203, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("TELEFONE");
		lblNewLabel_8.setBounds(10, 282, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			com.poo.model.Funcionario func = new com.poo.model.Funcionario();

			
				
				
			func.setCodigo(textCodigo.getText());
			func.setCargo(textCargo.getText());
			func.setNome(textNome.getText());
			func.setCpf(textCPF.getText());
			func.setEndereco(textEndereco.getText());
			func.setCidade(textCidade.getText());
			func.setEstado(textEstado.getText());
			func.setTelefone(textTelefone.getText());
			func.setEmail(textEmail.getText());
			
			com.poo.dao.FuncionarioDAO dao = new com.poo.dao.FuncionarioDAO();
			dao.create(func);
			JOptionPane.showMessageDialog(null, "Funcionario Cadastrado com sucesso!!");


			
			}
		});
		btnIncluir.setBounds(98, 364, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(351, 364, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCodigo.setText("");
				textCargo.setText("");
				textNome.setText("");
				textCPF.setText("");
				textEndereco.setText("");
				textCidade.setText("");
				textTelefone.setText("");
				textEmail.setText("");
			}
		});
		btnLimpar.setBounds(228, 364, 89, 23);
		contentPane.add(btnLimpar);
		
		textEstado = new JTextField();
		textEstado.setBounds(266, 228, 108, 20);
		contentPane.add(textEstado);
		textEstado.setColumns(10);
		
		
	}
}

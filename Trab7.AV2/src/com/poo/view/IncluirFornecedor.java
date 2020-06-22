package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncluirFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textCNPJ;
	private JTextField textCidade;
	private JTextField textEndereco;
	private JTextField textEstado;
	private JTextField textTelefone;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirFornecedor frame = new IncluirFornecedor();
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
	public IncluirFornecedor() {
		setTitle("Cadastro Fornecedor");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00D3DIGO");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(10, 36, 103, 20);
		contentPane.add(textCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(10, 91, 329, 20);
		contentPane.add(textNome);
		
		JLabel lblNewLabel_4 = new JLabel("CNPJ");
		lblNewLabel_4.setBounds(10, 136, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textCNPJ = new JTextField();
		textCNPJ.setColumns(10);
		textCNPJ.setBounds(10, 161, 131, 20);
		contentPane.add(textCNPJ);
		
		JLabel lblNewLabel_6 = new JLabel("CIDADE");
		lblNewLabel_6.setBounds(208, 136, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(208, 161, 131, 20);
		contentPane.add(textCidade);
		
		JLabel lblNewLabel_5 = new JLabel("ENDERE\u00C7O");
		lblNewLabel_5.setBounds(10, 203, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(10, 228, 234, 20);
		contentPane.add(textEndereco);
		
		JLabel lblNewLabel_7 = new JLabel("ESTADO");
		lblNewLabel_7.setBounds(271, 203, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textEstado = new JTextField();
		textEstado.setColumns(10);
		textEstado.setBounds(266, 228, 108, 20);
		contentPane.add(textEstado);
		
		JLabel lblNewLabel_8 = new JLabel("TELEFONE");
		lblNewLabel_8.setBounds(10, 282, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(10, 307, 131, 20);
		contentPane.add(textTelefone);
		
		JLabel lblNewLabel_3 = new JLabel("E-MAIL");
		lblNewLabel_3.setBounds(175, 282, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(175, 307, 234, 20);
		contentPane.add(textEmail);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.poo.model.Fornecedor forn = new com.poo.model.Fornecedor();

				
				
				
				forn.setCodigo(textCodigo.getText());
				forn.setNome(textNome.getText());
				forn.setCnpj(textCNPJ.getText());
				forn.setEndereco(textEndereco.getText());
				forn.setCidade(textCidade.getText());
				forn.setEstado(textEstado.getText());
				forn.setTelefone(textTelefone.getText());
				forn.setEmail(textEmail.getText());
				
				com.poo.dao.FornecedorDAO dao = new com.poo.dao.FornecedorDAO();
				dao.create(forn);
				JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com sucesso!!");

			}
		});
		btnIncluir.setBounds(98, 364, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCodigo.setText("");
				textNome.setText("");
				textCNPJ.setText("");
				textEndereco.setText("");
				textCidade.setText("");
				textTelefone.setText("");
				textEmail.setText("");
			}
		});
		btnLimpar.setBounds(228, 364, 89, 23);
		contentPane.add(btnLimpar);
		
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
	}
}

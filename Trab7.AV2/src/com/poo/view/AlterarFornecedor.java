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
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AlterarFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textCnpj;
	private JTextField textEndereco;
	private JTextField textCidade;
	private JTextField textEstado;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JTextField textCodigoBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarFornecedor frame = new AlterarFornecedor();
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
	public AlterarFornecedor() {
		setTitle("Alterar Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00D3DIGO");
		lblNewLabel.setBounds(10, 120, 46, 14);
		contentPane.add(lblNewLabel);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(10, 145, 103, 20);
		contentPane.add(textCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(10, 176, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(10, 201, 329, 20);
		contentPane.add(textNome);
		
		JLabel lblNewLabel_4 = new JLabel("CNPJ");
		lblNewLabel_4.setBounds(10, 232, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textCnpj = new JTextField();
		textCnpj.setColumns(10);
		textCnpj.setBounds(10, 257, 131, 20);
		contentPane.add(textCnpj);
		
		JLabel lblNewLabel_6 = new JLabel("CIDADE");
		lblNewLabel_6.setBounds(197, 232, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(197, 257, 131, 20);
		contentPane.add(textCidade);
		
		JLabel lblNewLabel_5 = new JLabel("ENDERE\u00C7O");
		lblNewLabel_5.setBounds(10, 288, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(10, 313, 234, 20);
		contentPane.add(textEndereco);
		
		JLabel lblNewLabel_7 = new JLabel("ESTADO");
		lblNewLabel_7.setBounds(271, 288, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textEstado = new JTextField();
		textEstado.setColumns(10);
		textEstado.setBounds(254, 313, 108, 20);
		contentPane.add(textEstado);
		
		JLabel lblNewLabel_8 = new JLabel("TELEFONE");
		lblNewLabel_8.setBounds(10, 344, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(10, 369, 131, 20);
		contentPane.add(textTelefone);
		
		JLabel lblNewLabel_3 = new JLabel("E-MAIL");
		lblNewLabel_3.setBounds(175, 344, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(175, 369, 234, 20);
		contentPane.add(textEmail);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				com.poo.model.Fornecedor fornec = new com.poo.model.Fornecedor();
				
				fornec.setCodigo(textCodigo.getText());
				
				fornec.setNome(textNome.getText());
				fornec.setCnpj(textCnpj.getText());
				fornec.setEndereco(textEndereco.getText());
				fornec.setCidade(textCidade.getText());
				fornec.setEstado(textEstado.getText());
				fornec.setTelefone(textTelefone.getText());
				fornec.setEmail(textEmail.getText());


				com.poo.dao.FornecedorDAO dao = new com.poo.dao.FornecedorDAO();
				dao.update(fornec);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!!");
				
			}
		});
		btnAlterar.setBounds(98, 426, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCodigo.setText("");
				textNome.setText("");
				textEndereco.setText("");
				textCnpj.setText("");
				
				textEstado.setText("");
				textCidade.setText("");
				textTelefone.setText("");
				textEmail.setText("");
			}
		});
		btnLimpar.setBounds(228, 426, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(351, 426, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_9 = new JLabel("C\u00D3DIGO");
		lblNewLabel_9.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		textCodigoBuscar = new JTextField();
		textCodigoBuscar.setColumns(10);
		textCodigoBuscar.setBounds(10, 30, 103, 20);
		contentPane.add(textCodigoBuscar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(123, 29, 89, 23);
		contentPane.add(btnBuscar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 75, 565, 2);
		contentPane.add(separator);
	}

}

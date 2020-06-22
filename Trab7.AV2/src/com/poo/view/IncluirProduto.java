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

public class IncluirProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textQtd;
	private JTextField textDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirProduto frame = new IncluirProduto();
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
	public IncluirProduto() {
		setTitle("Cadastro Produto");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(10, 36, 103, 20);
		contentPane.add(textId);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(10, 91, 329, 20);
		contentPane.add(textNome);
		
		JLabel lblNewLabel_4 = new JLabel("QUANTIDADE");
		lblNewLabel_4.setBounds(10, 136, 90, 14);
		contentPane.add(lblNewLabel_4);
		
		textQtd = new JTextField();
		textQtd.setColumns(10);
		textQtd.setBounds(10, 161, 131, 20);
		contentPane.add(textQtd);
		
		JLabel lblNewLabel_5 = new JLabel("DESCRI\u00C7\u00C3O");
		lblNewLabel_5.setBounds(10, 203, 90, 14);
		contentPane.add(lblNewLabel_5);
		
		textDescricao = new JTextField();
		textDescricao.setColumns(10);
		textDescricao.setBounds(10, 228, 234, 20);
		contentPane.add(textDescricao);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				com.poo.model.Produto prod = new com.poo.model.Produto();

				
				
				
				prod.setId(textId.getText());
				prod.setNome(textNome.getText());
				prod.setQtd(textQtd.getText());
				prod.setDescricao(textDescricao.getText());
			
				
				com.poo.dao.ProdutoDAO dao = new com.poo.dao.ProdutoDAO();
				dao.create(prod);
				JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!!");

			}
		});
		btnIncluir.setBounds(83, 326, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textId.setText("");
				textNome.setText("");
				textQtd.setText("");
				textDescricao.setText("");
				
			}
		});
		btnLimpar.setBounds(213, 326, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				dispose();
				menu.setVisible(true);
			}
		});
		btnVoltar.setBounds(336, 326, 89, 23);
		contentPane.add(btnVoltar);
	}

}

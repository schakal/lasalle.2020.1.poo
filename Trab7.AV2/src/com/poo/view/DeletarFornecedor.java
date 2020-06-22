package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletarFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigoForn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletarFornecedor frame = new DeletarFornecedor();
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
	public DeletarFornecedor() {
		setTitle("Deletar Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExclusãoForn = new JLabel("Excluir Fornecedor");
		lblExclusãoForn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExclusãoForn.setBounds(160, 59, 176, 20);
		contentPane.add(lblExclusãoForn);
		
		JLabel lblCodigoForn = new JLabel("Codigo:");
		lblCodigoForn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigoForn.setBounds(109, 113, 72, 14);
		contentPane.add(lblCodigoForn);
		
		textCodigoForn = new JTextField();
		textCodigoForn.setColumns(10);
		textCodigoForn.setBounds(191, 112, 132, 20);
		contentPane.add(textCodigoForn);
		
		JButton btnDeletar = new JButton("Apagar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.poo.model.Fornecedor forn = new com.poo.model.Fornecedor();
				
				forn.setCodigo(textCodigoForn.getText());
				com.poo.dao.FornecedorDAO dao = new com.poo.dao.FornecedorDAO();
				dao.delete(forn);
				JOptionPane.showMessageDialog(null, "Fornecedor apagado com sucesso!!");

				
			}
		});
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDeletar.setBounds(191, 179, 104, 26);
		contentPane.add(btnDeletar);
		
		JButton btnMenu = new JButton("Voltar");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(191, 216, 104, 23);
		contentPane.add(btnMenu);
	}

}

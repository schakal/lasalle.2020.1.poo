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

public class DeletarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigoProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletarProduto frame = new DeletarProduto();
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
	public DeletarProduto() {
		setTitle("Deletar produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExclusão = new JLabel("Excluir Produto");
		lblExclusão.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExclusão.setBounds(156, 67, 172, 20);
		contentPane.add(lblExclusão);
		
		JLabel lblCodigoProd = new JLabel("Codigo:");
		lblCodigoProd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigoProd.setBounds(103, 121, 72, 14);
		contentPane.add(lblCodigoProd);
		
		textCodigoProd = new JTextField();
		textCodigoProd.setColumns(10);
		textCodigoProd.setBounds(185, 120, 132, 20);
		contentPane.add(textCodigoProd);
		
		JButton btnDeletar = new JButton("Apagar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.poo.model.Produto prod = new com.poo.model.Produto();
				
				prod.setId(textCodigoProd.getText());
				com.poo.dao.ProdutoDAO dao = new com.poo.dao.ProdutoDAO();
				dao.delete(prod);
				JOptionPane.showMessageDialog(null, "Produto apagado com sucesso!!");

			}
		});
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDeletar.setBounds(185, 187, 104, 26);
		contentPane.add(btnDeletar);
		
		JButton btnMenu = new JButton("Voltar");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(185, 227, 104, 23);
		contentPane.add(btnMenu);
	}

}

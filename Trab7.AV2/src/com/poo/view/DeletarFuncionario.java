package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.dao.FuncionarioDAO;
import com.poo.model.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigoFunc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletarFuncionario frame = new DeletarFuncionario();
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
	public DeletarFuncionario() {
		setTitle("Deletar Funcionário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExclusão = new JLabel("Excluir Funcion\u00E1rio");
		lblExclusão.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExclusão.setBounds(126, 43, 171, 20);
		contentPane.add(lblExclusão);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigo.setBounds(83, 97, 72, 14);
		contentPane.add(lblCodigo);
		
		textCodigoFunc = new JTextField();
		textCodigoFunc.setColumns(10);
		textCodigoFunc.setBounds(165, 96, 132, 20);
		contentPane.add(textCodigoFunc);
		
		JButton btnDeletarFunc = new JButton("Apagar");
		btnDeletarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			com.poo.model.Funcionario func = new com.poo.model.Funcionario();
				
				func.setCodigo(textCodigoFunc.getText());
				com.poo.dao.FuncionarioDAO dao = new com.poo.dao.FuncionarioDAO();
				dao.delete(func);
				JOptionPane.showMessageDialog(null, "Funcionario apagado com sucesso!!");

				

			}
		});
		btnDeletarFunc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDeletarFunc.setBounds(165, 163, 104, 26);
		contentPane.add(btnDeletarFunc);
		
		JButton btnMenu = new JButton("Voltar");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(165, 200, 104, 23);
		contentPane.add(btnMenu);
	}
}

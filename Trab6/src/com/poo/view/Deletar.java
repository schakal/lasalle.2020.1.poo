package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Deletar extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deletar frame = new Deletar();
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
	public Deletar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Deletar.class.getResource("/image/user_delete.png")));
		setTitle("Deletar Aluno");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(153, 113, 132, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(71, 114, 72, 14);
		contentPane.add(lblMatricula);
		
		JButton btnDeletar = new JButton("Apagar");
		btnDeletar.setIcon(new ImageIcon(Deletar.class.getResource("/image/delete.png")));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.poo.model.Aluno aluno = new com.poo.model.Aluno();
				
				aluno.setMatricula(textMatricula.getText());
				com.poo.dao.AlunoDAO dao = new com.poo.dao.AlunoDAO();
				dao.delete(aluno);
				JOptionPane.showMessageDialog(null, "Aluno apagado com sucesso!!");

				
			}
		});
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDeletar.setBounds(153, 180, 104, 26);
		contentPane.add(btnDeletar);
		
		JLabel lblExclusão = new JLabel("Exclus\u00E3o");
		lblExclusão.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExclusão.setBounds(164, 60, 82, 20);
		contentPane.add(lblExclusão);
		
		JButton btnPrincipal = new JButton("");
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal().setVisible(true);
			     dispose();
			}
		});
		btnPrincipal.setIcon(new ImageIcon(Deletar.class.getResource("/image/arrow_left.png")));
		btnPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrincipal.setBounds(10, 11, 49, 23);
		contentPane.add(btnPrincipal);
	}
}

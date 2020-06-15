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
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Alterar extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textNomeAntigo;
	private JTextField textNomeNovo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alterar frame = new Alterar();
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
	public Alterar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Alterar.class.getResource("/image/user_edit.png")));
		setTitle("Alterar Aluno");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlterar = new JLabel("Altera\u00E7\u00E3o");
		lblAlterar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlterar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAlterar.setBounds(114, 11, 179, 32);
		contentPane.add(lblAlterar);
		
		textMatricula = new JTextField();
		textMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMatricula.setBounds(166, 77, 127, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		textNomeAntigo = new JTextField();
		textNomeAntigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNomeAntigo.setBounds(166, 121, 127, 20);
		contentPane.add(textNomeAntigo);
		textNomeAntigo.setColumns(10);
		
		textNomeNovo = new JTextField();
		textNomeNovo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNomeNovo.setBounds(166, 164, 127, 20);
		contentPane.add(textNomeNovo);
		textNomeNovo.setColumns(10);
		
		JButton btnAltera = new JButton("Alterar");
		btnAltera.setIcon(new ImageIcon(Alterar.class.getResource("/image/application_edit.png")));
		btnAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.poo.model.Aluno aluno = new com.poo.model.Aluno();
				
				aluno.setMatricula(textMatricula.getText());
				aluno.setNome(textNomeAntigo.getText());
				aluno.setNome(textNomeNovo.getText());
				com.poo.dao.AlunoDAO dao = new com.poo.dao.AlunoDAO();
				dao.update(aluno);
				JOptionPane.showMessageDialog(null, "Aluno Alterado com sucesso!!");

			}
		});
		btnAltera.setBounds(166, 227, 103, 23);
		contentPane.add(btnAltera);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(64, 80, 63, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblAntigoNome = new JLabel("Nome Antigo:");
		lblAntigoNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAntigoNome.setBounds(64, 124, 89, 14);
		contentPane.add(lblAntigoNome);
		
		JLabel lblNomeNovo = new JLabel("Nome Novo:");
		lblNomeNovo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeNovo.setBounds(64, 167, 89, 14);
		contentPane.add(lblNomeNovo);
		
		JButton btnPrincipal = new JButton("");
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal().setVisible(true);
			     dispose();
			}
		});
		btnPrincipal.setIcon(new ImageIcon(Alterar.class.getResource("/image/arrow_left.png")));
		btnPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrincipal.setBounds(10, 11, 49, 23);
		contentPane.add(btnPrincipal);
	}
}

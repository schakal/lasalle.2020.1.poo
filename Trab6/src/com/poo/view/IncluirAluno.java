package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class IncluirAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirAluno frame = new IncluirAluno();
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
	public IncluirAluno() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IncluirAluno.class.getResource("/image/user_add.png")));
		setTitle("Inclusão Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setHorizontalAlignment(SwingConstants.LEFT);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(55, 79, 115, 20);
		contentPane.add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMatricula.setBounds(170, 79, 141, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(55, 115, 115, 20);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNome.setColumns(10);
		textNome.setBounds(170, 115, 141, 20);
		contentPane.add(textNome);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.poo.model.Aluno aluno = new com.poo.model.Aluno();
				
				aluno.setMatricula(textMatricula.getText());
				aluno.setNome(textNome.getText());
				com.poo.dao.AlunoDAO dao = new com.poo.dao.AlunoDAO();
				dao.create(aluno);
				
				JOptionPane.showMessageDialog(null, "Aluno Cadastrado com sucesso!!");
			}
		});
		btnIncluir.setIcon(new ImageIcon(IncluirAluno.class.getResource("/image/add.png")));
		btnIncluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIncluir.setBounds(117, 196, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(IncluirAluno.class.getResource("/image/cancel.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(239, 196, 109, 23);
		contentPane.add(btnCancelar);
		
		JButton btnPrincipal = new JButton("");
		btnPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrincipal.setIcon(new ImageIcon(IncluirAluno.class.getResource("/image/arrow_left.png")));
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal().setVisible(true);
			     dispose();
			    




				
				
			}
		});
		btnPrincipal.setBounds(10, 11, 49, 23);
		contentPane.add(btnPrincipal);
	}

	
}

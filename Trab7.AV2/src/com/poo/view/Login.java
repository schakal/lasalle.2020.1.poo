package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUsuario.setBounds(179, 86, 117, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(179, 136, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(UIManager.getColor("text"));
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setBounds(78, 89, 68, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(UIManager.getColor("text"));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSenha.setBounds(78, 139, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textUsuario.getText().equals("admin") &&
						textField_1.getText().equals("1234")) {
					Menu menu = new Menu();
					menu.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha ou Usuario Incorreto");
				}
			}
		});
		btnLogin.setBounds(124, 209, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnCancelar.setIcon(new ImageIcon(Login.class.getResource("/image/cancel.png")));
		btnCancelar.setBounds(223, 209, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblbg_fundo_login = new JLabel("");
		lblbg_fundo_login.setIcon(new ImageIcon("C:\\Users\\aless\\Desktop\\fundo-gradiente-suave_77528-21.jpg"));
		lblbg_fundo_login.setBounds(0, 0, 434, 261);
		contentPane.add(lblbg_fundo_login);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(179, 138, 117, 18);
		contentPane.add(passwordField);
	}
}

package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/image/tux.png")));
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIncluir = new JButton("Cadastrar");
		btnIncluir.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/image/add.png")));
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new IncluirAluno().setVisible(true);
			     dispose();
			      
			}
		});
		btnIncluir.setBounds(168, 51, 115, 23);
		contentPane.add(btnIncluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/image/zoom.png")));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Consultar().setVisible(true);
			     dispose();
			     


			    
				
			Consultar consultar = new Consultar();
		      consultar.setVisible(true);
				
			}
		});
		btnConsultar.setBounds(168, 85, 115, 23);
		contentPane.add(btnConsultar);
		
		JButton btnAltera = new JButton("Alterar");
		btnAltera.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/image/application_edit.png")));
		btnAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Alterar().setVisible(true);
			     dispose();
			    
			}
		});
		btnAltera.setBounds(168, 119, 115, 23);
		contentPane.add(btnAltera);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/image/delete.png")));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Deletar().setVisible(true);
			     dispose();
			    
			}
		});
		btnDeletar.setBounds(168, 153, 115, 23);
		contentPane.add(btnDeletar);
	}

}

package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Splash extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar = new JProgressBar();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Splash sp = new Splash();
		sp.setVisible(true);
		carregar();
		new Login().setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public Splash() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Splash.class.getResource("/image/star.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(0, 255, 0));
		progressBar.setBounds(0, 247, 434, 14);
		contentPane.add(progressBar);
		
		JLabel lblbg_fundo = new JLabel("");
		lblbg_fundo.setIcon(new ImageIcon("C:\\Users\\aless\\Desktop\\bg_sorvete.jpg"));
		lblbg_fundo.setBounds(0, 0, 434, 261);
		contentPane.add(lblbg_fundo);
	}
	public static void  carregar() {
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(50);
				progressBar.setValue(i);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Não foi possivel Carregar!"+e.getMessage());
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}

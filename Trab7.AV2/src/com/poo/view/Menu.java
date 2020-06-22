package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/image/star.png")));
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIncluirFunc = new JButton("Funcion\u00E1rio");
		btnIncluirFunc.setIcon(new ImageIcon(Menu.class.getResource("/image/group_add.png")));
		btnIncluirFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncluirFuncionario incluifunc = new IncluirFuncionario();
				incluifunc.setVisible(true);
				dispose();
			}
		});
		btnIncluirFunc.setBounds(10, 41, 181, 23);
		contentPane.add(btnIncluirFunc);
		
		JButton btnConsultarFunc = new JButton("Consultar Funcion\u00E1rio");
		btnConsultarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarFuncionario consultfunc = new ConsultarFuncionario();
				consultfunc.setVisible(true);
				dispose();

			}
		});
		btnConsultarFunc.setIcon(new ImageIcon(Menu.class.getResource("/image/zoom.png")));
		btnConsultarFunc.setBounds(10, 75, 181, 23);
		contentPane.add(btnConsultarFunc);
		
		JButton btnAlteraFunc = new JButton("Alterar Funcion\u00E1rio");
		btnAlteraFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarFuncionario altfunc = new AlterarFuncionario();
				altfunc.setVisible(true);
				dispose();

			}
		});
		btnAlteraFunc.setIcon(new ImageIcon(Menu.class.getResource("/image/group_edit.png")));
		btnAlteraFunc.setBounds(10, 109, 181, 23);
		contentPane.add(btnAlteraFunc);
		
		JButton btnDeletarFunc = new JButton("Deletar Funcion\u00E1rio");
		btnDeletarFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletarFuncionario delfunc = new DeletarFuncionario();
				delfunc.setVisible(true);
				dispose();

				
			}
		});
		btnDeletarFunc.setIcon(new ImageIcon(Menu.class.getResource("/image/group_delete.png")));
		btnDeletarFunc.setBounds(10, 143, 181, 23);
		contentPane.add(btnDeletarFunc);
		
		JButton btnIncluirForn = new JButton("Fornecedor");
		btnIncluirForn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncluirFornecedor incluiforn = new IncluirFornecedor();
				incluiforn.setVisible(true);
				dispose();
			}
			
		});
		btnIncluirForn.setIcon(new ImageIcon(Menu.class.getResource("/image/group_add.png")));
		btnIncluirForn.setBounds(257, 41, 181, 23);
		contentPane.add(btnIncluirForn);
		
		JButton btnIncluirProd = new JButton("Produto");
		btnIncluirProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncluirProduto incluiprod = new IncluirProduto();
				incluiprod.setVisible(true);
				dispose();
			}
		});
		btnIncluirProd.setIcon(new ImageIcon(Menu.class.getResource("/image/group_add.png")));
		btnIncluirProd.setBounds(10, 228, 181, 23);
		contentPane.add(btnIncluirProd);
		
		JButton btnConsultarForn = new JButton("Consultar Fornecedor");
		btnConsultarForn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarFornecedor consultforn = new ConsultarFornecedor();
				consultforn.setVisible(true);
				dispose();
			}
		});
		btnConsultarForn.setIcon(new ImageIcon(Menu.class.getResource("/image/zoom.png")));
		btnConsultarForn.setBounds(257, 75, 181, 23);
		contentPane.add(btnConsultarForn);
		
		JButton btnNewButton_1 = new JButton("Consultar Produto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarProduto consultprod = new ConsultarProduto();
				consultprod.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Menu.class.getResource("/image/zoom.png")));
		btnNewButton_1.setBounds(10, 262, 181, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnAlteraForn = new JButton("Alterar Fornecedor");
		btnAlteraForn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarFornecedor altforn = new AlterarFornecedor();
				altforn.setVisible(true);
				dispose();
			}
		});
		btnAlteraForn.setIcon(new ImageIcon(Menu.class.getResource("/image/group_edit.png")));
		btnAlteraForn.setBounds(257, 109, 181, 23);
		contentPane.add(btnAlteraForn);
		
		JButton btnDeletarForn = new JButton("Deletar Fornecedor");
		btnDeletarForn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletarFornecedor delforn = new DeletarFornecedor();
				delforn.setVisible(true);
				dispose();
			}
		});
		btnDeletarForn.setIcon(new ImageIcon(Menu.class.getResource("/image/group_delete.png")));
		btnDeletarForn.setBounds(257, 143, 181, 23);
		contentPane.add(btnDeletarForn);
		
		JLabel lblNewLabel = new JLabel("Fornecedor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(257, 11, 181, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFuncionrio.setBounds(10, 11, 181, 23);
		contentPane.add(lblFuncionrio);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProduto.setBounds(10, 194, 181, 23);
		contentPane.add(lblProduto);
		
		JButton btnNewButton = new JButton("Alterar produto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarProduto altprod = new AlterarProduto();
				altprod.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/image/group_edit.png")));
		btnNewButton.setBounds(10, 296, 181, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Deletar Produto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletarProduto delprod = new DeletarProduto();
				delprod.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Menu.class.getResource("/image/group_delete.png")));
		btnNewButton_2.setBounds(10, 330, 181, 23);
		contentPane.add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 194, 554, 2);
		contentPane.add(separator);
	}
}

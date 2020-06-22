package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.poo.dao.ProdutoDAO;
import com.poo.model.Funcionario;
import com.poo.model.Produto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AlterarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textQtd;
	private JTextField textDesc;
	private JTextField textIdProd;
	DefaultTableModel modelo = new DefaultTableModel();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarProduto frame = new AlterarProduto();
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
	public AlterarProduto() {
		setTitle("Alterar Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(10, 109, 103, 20);
		contentPane.add(textId);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(10, 140, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(10, 164, 329, 20);
		contentPane.add(textNome);
		
		JLabel lblNewLabel_4 = new JLabel("QUANTIDADE");
		lblNewLabel_4.setBounds(10, 209, 90, 14);
		contentPane.add(lblNewLabel_4);
		
		textQtd = new JTextField();
		textQtd.setColumns(10);
		textQtd.setBounds(10, 234, 131, 20);
		contentPane.add(textQtd);
		
		JLabel lblNewLabel_5 = new JLabel("DESCRI\u00C7\u00C3O");
		lblNewLabel_5.setBounds(10, 276, 90, 14);
		contentPane.add(lblNewLabel_5);
		
		textDesc = new JTextField();
		textDesc.setColumns(10);
		textDesc.setBounds(10, 301, 234, 20);
		contentPane.add(textDesc);
		
		JButton btnIncluir = new JButton("Alterar");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					com.poo.model.Produto prod = new com.poo.model.Produto();
					
					prod.setId(textId.getText());
					prod.setNome(textNome.getText());
					prod.setQtd(textQtd.getText());
					prod.setDescricao(textDesc.getText());
					com.poo.dao.ProdutoDAO dao = new com.poo.dao.ProdutoDAO();
					dao.update(prod);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!!");
				
				

			}
		});
		btnIncluir.setBounds(83, 399, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textId.setText("");
				textNome.setText("");
				textQtd.setText("");
				textDesc.setText("");
				
			
			}
		});
		btnLimpar.setBounds(213, 399, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(336, 399, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_9 = new JLabel("ID");
		lblNewLabel_9.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		textIdProd = new JTextField();
		textIdProd.setColumns(10);
		textIdProd.setBounds(10, 30, 103, 20);
		contentPane.add(textIdProd);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*
				try {
				String id = textIdProd.getText();
				
				com.poo.dao.ProdutoDAO dao = new com.poo.dao.ProdutoDAO();

				//ArrayList<Produto> produtos = dao.readAll();
			    ArrayList<Produto> produtos = dao.(id);

				
			    AbstractButton table = null;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
			    model.setNumRows(0);
			    
			    for (Produto p : produtos) {
			    	textId.setText(String.valueOf(p.getId()));
			    	textNome.setText(p.getNome());
			    	textQtd.setText(p.getQtd());
			    	textDesc.setText(p.getDescricao());

				
			    }} catch (Exception e2) {
				// TODO: handle exception
			}

					
					
				}
			
			*/
			}
		});
		btnBuscar.setBounds(123, 29, 89, 23);
		contentPane.add(btnBuscar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 61, 547, 2);
		contentPane.add(separator);
	}

}

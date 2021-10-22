package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.calculo.CalculoImc;

public class TelaImc {
	
	public void TelaCriar() {
		
		//FONTES DA MINHA TELA
		Font fontTitulo = new Font("Cooper Black",Font.BOLD, 22);
		Font fontTexto = new Font("Arial",Font.PLAIN, 15);
		Font fontSubtitulo = new Font("Arial",Font.BOLD,18);
		Font fontResultado = new Font("Arial",Font.BOLD,15);
		
		//CORES DA MINHA TELA
		Color titulo = new Color(50,80,77);
		
		CalculoImc Multiplicar = new CalculoImc();
		
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		// CRIAR UM LABEL
		JLabel lblCalcular = new JLabel();
		this.setColor(Color.white);
		lblCalcular.setFont(fontTitulo);
		lblCalcular.setForeground(titulo);
		lblCalcular.setBackground(Color.lightGray);
		this.add(lblCalcular);
		lblCalcular.setText("Cálculo de IMC");
		lblCalcular.setBounds(100,20,300,30);
		
		//PESO
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso: ");
		lblPeso.setBounds(40,80,110,30);
		
		//ALTURA
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura: ");
		lblAltura.setBounds(40,120,110,30);
		
		//CRIAR UM FIELD
		//TEXTO PESO
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(120,80,110,30);
		
		//TEXTO ALTURA
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(120,120,110,30);
		
		//CRIAR UM BOTÃO 
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular ");
		btnCalcular.setBounds(120,170,130,30);
		
		//RESULTADO
		JLabel lblResultados = new JLabel();
		lblResultados.setText("RESULTADOS: ");
		lblResultados.setBounds(40,220,110,30);
		
		//VALOR IMC
		JLabel lblValor = new JLabel();
		lblValor.setText("Valor IMC: ");
		lblValor.setBounds(40,250,110,30);
		
		JLabel lblImc = new JLabel();
		lblImc.setText("");
		lblImc.setBounds(120,250,110,30);
		
		//ESTADO IMC	
		JLabel lblEstado1 = new JLabel();
		lblEstado1.setText("Estado IMC: ");
		lblEstado1.setBounds(40,280,110,30);
		
		JLabel lblEstado = new JLabel();
		lblEstado.setText("");
		lblEstado.setBounds(120,280,110,30);
		
		//COLOCAR O LABEL NA TELA
		telaImc.getContentPane().add(lblPeso);
		telaImc.getContentPane().add(lblCalcular);
		telaImc.getContentPane().add(txtAltura);
		telaImc.getContentPane().add(txtPeso);
		telaImc.getContentPane().add(lblAltura);
		telaImc.getContentPane().add(btnCalcular);
		telaImc.getContentPane().add(lblResultados);
		telaImc.getContentPane().add(lblValor);
		telaImc.getContentPane().add(lblEstado1);
		telaImc.getContentPane().add(lblImc);
		telaImc.getContentPane().add(lblEstado);
		
		telaImc.setVisible(true);
		
		
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//PEGANDO A ALTURA E COLOCANDO EM STRING
				CalculoImc imc = new CalculoImc();
				imc.setAltura(txtAltura.getText());
				imc.setPeso(txtPeso.getText());
				
				lblEstado.setText(imc.obterStatus());
				lblImc.setText(imc.obterImcString());
			}
			
		});
	}

	private void setColor(Color white) {
		// TODO Auto-generated method stub
	}
	private void add(JLabel lblCalcular) {
		// TODO Auto-generated method stub
		
	}
}


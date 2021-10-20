package br.senai.sp.jandira.ui;

import java.awt.Color;
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
		
		CalculoImc Multiplicar = new CalculoImc();
		
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		// CRIAR UM LABEL
		JLabel lblCalcular = new JLabel();
		this.setColor(Color.white);
		lblCalcular.setForeground(Color.blue);
		lblCalcular.setBackground(Color.lightGray);
		this.add(lblCalcular);
		lblCalcular.setText("Cálculo de IMC");
		lblCalcular.setBounds(100,20,110,30);
		
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
		
		//ESTADO IMC
		JLabel lblEstado = new JLabel();
		lblEstado.setText("Estado IMC: ");
		lblEstado.setBounds(40,280,110,30);
		
		JLabel lblEstado1 = new JLabel();
		lblEstado1.setText("Estado IMC: ");
		lblEstado1.setBounds(40,280,110,30);
		
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
		
		telaImc.setVisible(true);
		
		//DEFINIR OUVINTE (LISTENER) DE CLICK DO MOUSE
		txtPeso.addMouseListener(new MouseListener() {
					
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltou!!! ");		
			}	
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertou!!! ");
						
			}	
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Saiu!!! ");
						
			}	
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entrou!!!");
				
			}		
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
		}
		);
		txtPeso.addKeyListener(new KeyListener() {			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Tecla digitada!");
				System.out.println(e.getKeyChar());		
			}
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Tecla solta!");
						
			}
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Tecla apertada!");		
			}
		});
	}

	private void setColor(Color white) {
		// TODO Auto-generated method stub
		
	}

	private void add(JLabel label) {
		// TODO Auto-generated method stub
		
	}
	

}

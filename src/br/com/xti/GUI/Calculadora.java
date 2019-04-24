package br.com.xti.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {	
	
	public Calculadora() {
		super("Calculadora");
		
		JButton numero7 = new JButton();
		numero7.setFont(new Font("serif", Font.BOLD, 36));
		numero7.setText("7");
		JButton numero8 = new JButton();
		numero8.setFont(new Font("serif", Font.BOLD, 36));
		numero8.setText("8");
		JButton numero9 = new JButton();
		numero9.setFont(new Font("serif", Font.BOLD, 36));
		numero9.setText("9");
		JButton numeroB = new JButton();
		numeroB.setFont(new Font("serif", Font.BOLD, 36));
		numeroB.setText("/");
		JButton numero4 = new JButton();
		numero4.setFont(new Font("serif", Font.BOLD, 36));
		numero4.setText("4");
		JButton numero5 = new JButton();
		numero5.setFont(new Font("serif", Font.BOLD, 36));
		numero5.setText("5");
		JButton numero6 = new JButton();
		numero6.setFont(new Font("serif", Font.BOLD, 36));
		numero6.setText("6");
		JButton numeroA = new JButton();
		numeroA.setFont(new Font("serif", Font.BOLD, 36));
		numeroA.setText("*");
		JButton numero1 = new JButton();
		numero1.setFont(new Font("serif", Font.BOLD, 36));
		numero1.setText("1");
		JButton numero2 = new JButton();
		numero2.setFont(new Font("serif", Font.BOLD, 36));
		numero2.setText("2");
		JButton numero3 = new JButton();
		numero3.setFont(new Font("serif", Font.BOLD, 36));
		numero3.setText("3");
		JButton numeroM = new JButton();
		numeroM.setFont(new Font("serif", Font.BOLD, 36));
		numeroM.setText("-");
		JButton numero0 = new JButton();
		numero0.setFont(new Font("serif", Font.BOLD, 36));
		numero0.setText("0");
		JButton ponto = new JButton();
		ponto.setFont(new Font("serif", Font.BOLD, 36));
		ponto.setText(".");
		JButton igual = new JButton();
		igual.setFont(new Font("serif", Font.BOLD, 36));
		igual.setText("=");
		JButton mais = new JButton();
		mais.setFont(new Font("serif", Font.BOLD, 36));
		mais.setText("+");
		
		Container n = new JPanel();		
		n.setLayout(new GridLayout(4, 4, 5, 5));
		n.add(numero7);
		n.add(numero8);
		n.add(numero9);
		n.add(numeroB);
		n.add(numero4);
		n.add(numero5);
		n.add(numero6);
		n.add(numeroA);
		n.add(numero1);
		n.add(numero2);
		n.add(numero3);
		n.add(numeroM);		
		n.add(ponto);
		n.add(numero0);
		n.add(igual);
		n.add(mais);
		
		JTextField display = new JTextField();
		display.setFont(new Font("serif", Font.BOLD, 100));
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, n);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculadora();

	}

}

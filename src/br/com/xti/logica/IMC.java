package br.com.xti.logica;
/**
* Calcular o IMC
* @author Roberto de Souza
* IMC = paso / (altura)2
*/

import javax.swing.JOptionPane;

public class IMC{
	public static void main(String[] args){
		//Criando interação com o usuario com telas
		String pesoin = JOptionPane.showInputDialog("Qual seu peso em Kg?");
		String alturain = JOptionPane.showInputDialog("Qual sua Altura em Metros?");
		
		double peso = Double.parseDouble(pesoin);
		double altura = Double.parseDouble(alturain);
		
		//double peso = 73; // informação fixa
		//double altura = 1.73; // informação fixa
		double imc = peso / (altura * altura);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora peso ideal"; 
		msg = "IMC = " + imc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		//System.out.println("Seu IMC = " + imc);
		//System.out.println(msg);
	}
}
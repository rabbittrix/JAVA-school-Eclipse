package br.com.xti.logica;
/** 
 * @author Robero de Souza
 * Desafio fazer um dado e que o usuario tenta adivinhar o valor do dado
 * 
 */
 
 import javax.swing.JOptionPane;
 import java.util.Scanner;
 import java.util.Random;
 
 public class Dado{
	 public static void main(String[] args){
		// O usuario indica o valor 
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu palpite?");
		int palpite = s.nextInt();
		
		//Valor do dado
		Random r = new Random();
		int dado = r.nextInt(6)+1;
		
		//Mostra o valor dos dois
		System.out.println("Seu palpite = " + palpite);
		System.out.println("Valor do Dado = " + dado);
		
		//Compara os dois valores
		if(palpite == dado){
			System.out.println("Acertou");
		}else {
			System.out.println("Errou");
		}
		
		//String nome = JOptionPane.showInputDialog("Qual e seu nme?");
		
		//JOptionPane.showMessageDialog(null, nome);
	 }
 }
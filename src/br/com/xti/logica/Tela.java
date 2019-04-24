package br.com.xti.logica;
/**
* Interação com o usuario
* @author Roberto de Souza
*/
import javax.swing.JOptionPane;
public class Tela {
	public static void main(String[] args){
		String nome = JOptionPane.showInputDialog("Qual e seu nme?");
		//System.out.println(nome); // Imprime a resposta no CMD
		JOptionPane.showMessageDialog(null, nome); // Imprime em uma tela
	}
}
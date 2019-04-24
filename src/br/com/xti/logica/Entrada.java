package br.com.xti.logica;
/**
* Interação com o usuario
* @author Roberto de Souza
*/
import java.util.Scanner;
public class Entrada{
	public static void main(String[] args){
		//recuperação na chamada do programa
		//System.out.println(args[0]);
		
		//interagir com o usuario
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem vindo: " + nome);
	}
}
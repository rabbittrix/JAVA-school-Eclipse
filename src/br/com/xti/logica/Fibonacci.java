package br.com.xti.logica;
/**
* Desafio Fibonacci
* @author Roberto de Souza
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		
		int anterior = 1;
		int proximo = 2;
		System.out.println(anterior);
		while(proximo < 50){
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
		}
		
		System.out.println();
		// Uso do break, continue, rotulo
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				//break; //Para no quinto
				continue; //Pula o quinto
			}
			System.out.print(i + ", ");
		}
	}
	
}


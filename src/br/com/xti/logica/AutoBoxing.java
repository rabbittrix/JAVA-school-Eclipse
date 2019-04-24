package br.com.xti.logica;
/**
* Boxing e Unboxing
* @author Roberto de Souza
*/
import java.util.ArrayList;
import java.util.Scanner;

public class AutoBoxing{
	public static void main(String[] args){
		//Encapsulando na forma antiga java 5 para baixo
		Integer x = new Integer(665);// empacotando
		int a = x.intValue();// desempacotando
		a++; // incremento o valor que estava empacotado
		x = new Integer(a); // re-empacoto
		System.out.println(x.intValue()); // imprime o valor empacotado
		
		//Novas versões acima do java 5, o mesmo codigoacima ficaria
		Integer n = 554;
		n++;//desempacotando, incremento, re-empacoto
		System.out.println(n);
	}
}
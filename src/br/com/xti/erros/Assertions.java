package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um numero de 0 a 10");
		int autenticar = s.nextInt();
		
		if (autenticar > 0 && autenticar < 10) {
							
			
			
			System.out.println("Voce entro " + autenticar);
			
		}else {
							
			System.out.println("Numero invalido " + autenticar);
			
		}
		
		assert (autenticar >0 && autenticar <= 10) : "Numero invalido"; // tem que ser ligada (.ae) ou desligada (-da)

	}

}

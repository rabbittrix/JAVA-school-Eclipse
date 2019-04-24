package br.com.xti.erros;

import java.util.Scanner;

public class CadastroSenha {
	
	
	public int cadastro(int codeS) {
		
		//int codeS;			
		
		Scanner senhaCode = new Scanner(System.in);
		System.out.println("Cadastre seu passwords...");
		codeS= senhaCode.nextInt();
				
		System.out.println("passwords cadastrado com sucesso... " + codeS);
		
		System.out.println("Efetue seu login...");
		return codeS ;
		
		
		
	}
	
	
}

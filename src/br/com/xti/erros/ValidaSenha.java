package br.com.xti.erros;

import java.util.Scanner;

public class ValidaSenha {

	public static void main (String[] args  ) {	
				
		
		CadastroSenha P1 = new CadastroSenha(int codeS)
								
		System.out.println("Seja bem vindo, o que gostaria de fazer?");
		System.out.println("tecle 01 para cadastrar uma senha ");
		System.out.println( "tecle 02 se já estiver uma senha");
		
		Scanner enter = new Scanner(System.in);
		int entrada = enter.nextInt();
						
		if (entrada == 01) {
						
			Scanner senhaCode = new Scanner(System.in);
			System.out.println("Cadastre seu passwords...");
			int codeS = senhaCode.nextInt();
					
			System.out.println("passwords cadastrado com sucesso... " + codeS);
			
			System.out.println("Efetue seu login...");
			
						
		}if (entrada == 02) {
			
			Scanner password = new Scanner(System.in);
			System.out.println("Entre com seu passwords..");
			int senha = password.nextInt();
			int passSave = S; //ele tem que pegar o valor que foi cadastrado
			int code = passSave;
			
			if (senha == code) {
				System.out.println("passwords correto..");
			}else {
				System.out.println("passwords incorreta, verifique seu passwords!!!");
			}
			
		}	
		
		
	}

}

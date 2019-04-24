package br.com.xti.erros;

import java.util.Scanner;

public class SenhaTest {
		static String senha;
		private static Scanner s;
		static void autenticar(String senha) 
		{			
			if("123".equals(senha)) {
				
				System.out.println("Autenticado");
			}else {
				
				System.out.println("Senha incorreta");
			}
		}
		
		public static void main (String[] args) {
			s = new Scanner(System.in);
			System.out.println("Entre com a senha");
			int num = s.nextInt();
			
			String digitado = Integer.toString(num);
			
			senha = digitado;

			if (digitado == "123") {
				
				autenticar(digitado);
										}
			}
			
		
	}

	



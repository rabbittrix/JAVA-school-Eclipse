package br.com.xti.logica;
/**
* Apresentar os conceitos de Variável
* @author Roberto de Souza
* Tipos de variaveis: String, int, boolean
* Tipos primitivos:
* double preço = 12.45;
* char sexo = 'M'; // Unicode
* byte b = 127; //cem 8 bits = 1 byte
* short s = 32767; //32 mil 16 bits = 2 byte
* int i = 2_000_000_000; //2 bilhões 32 bits = 4 byte
* long l = 9_000_000_000_000_000_000; // 9 quintilhão
* 
* //Formato IEEE 754
* double d = 1.7976931348623157E+308;
* float f = 123F;
*
* Variavel de Referencia = String (é um objeto)
*/

public class Variavel{
	public static void main(String[] args){
		
		String nome = "Roberto";
		int idade = 31;
		boolean solteiro = true;
		
		short s = 32767;
		int i = 2_000_000_000;
		long l = 900000000;
		
		// Cast Implicito
		i = s; 
		System.out.println(s);
		System.out.println(i);
		
		// Cast Explicito
		i = (int) l; // o meudeu erro
		System.out.println(l);
		System.out.println(i);
		
		System.out.println("Variaveis");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(solteiro);
	}
}